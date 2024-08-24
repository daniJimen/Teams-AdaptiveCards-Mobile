//
//  ACRTableCellRenderer
//  ACRTableCellRenderer.mm
//
//  Copyright © 2021 Microsoft. All rights reserved.
//

#import "ACRTableCellRenderer.h"
#import "ACOBaseCardElementPrivate.h"
#import "ACOHostConfigPrivate.h"
#import "ACRRendererPrivate.h"
#import "ACRTableCellView.h"
#import "TableCell.h"
#import "UtiliOS.h"
#import "FlowLayout.h"
#import "AreaGridLayout.h"
#import "ARCGridViewLayout.h"
#import "ACRLayoutHelper.h"

@implementation ACRTableCellRenderer

+ (ACRTableCellRenderer *)getInstance
{
    static ACRTableCellRenderer *singletonInstance = [[self alloc] init];
    return singletonInstance;
}

+ (ACRCardElementType)elemType
{
    return ACRTableCell;
}


- (UIView *)render:(UIView<ACRIContentHoldingView> *)viewGroup
           rootView:(ACRView *)rootView
             inputs:(NSMutableArray *)inputs
    baseCardElement:(ACOBaseCardElement *)acoElem
         hostConfig:(ACOHostConfig *)acoConfig;
{
    std::shared_ptr<BaseCardElement> elem = [acoElem element];
    auto cellElement = std::dynamic_pointer_cast<TableCell>(elem);
    ARCGridViewLayout *gridLayout;
    //Layout
    std::shared_ptr<Layout> final_layout = [[[ACRLayoutHelper alloc] init] layoutToApplyFrom:cellElement->GetLayouts() andHostConfig:acoConfig];
    if(final_layout->GetLayoutContainerType() == LayoutContainerType::Flow)
    {
        std::shared_ptr<FlowLayout> flow_layout = std::dynamic_pointer_cast<FlowLayout>(final_layout);
        // layout using flow layout
    }
    else if (final_layout->GetLayoutContainerType() == LayoutContainerType::AreaGrid)
    {
        std::shared_ptr<AreaGridLayout> grid_layout = std::dynamic_pointer_cast<AreaGridLayout>(final_layout);
        gridLayout = [[ARCGridViewLayout alloc] initWithGridLayout:grid_layout
                                                             style:(ACRContainerStyle)cellElement->GetStyle()
                                                       parentStyle:[viewGroup style]
                                                        hostConfig:acoConfig
                                                         superview:viewGroup];
        [ACRRenderer render:gridLayout
                   rootView:rootView
                     inputs:inputs
              withCardElems:cellElement->GetItems()
              andHostConfig:acoConfig];
    }
    else
    {
        // default stack based layout
    }
    ACRColumnView *cell = (ACRColumnView *)viewGroup;

    cell.rtl = rootView.context.rtl;

    renderBackgroundImage(cellElement->GetBackgroundImage(), cell, rootView);

    if(gridLayout)
    {
        [cell addArrangedSubview:gridLayout];
    }
    else
    {
        [ACRRenderer render:cell
                   rootView:rootView
                     inputs:inputs
              withCardElems:cellElement->GetItems()
              andHostConfig:acoConfig];
    }

    [cell setClipsToBounds:NO];

    std::shared_ptr<BaseActionElement> selectAction = cellElement->GetSelectAction();
    ACOBaseActionElement *acoSelectAction = [ACOBaseActionElement getACOActionElementFromAdaptiveElement:selectAction];
    [cell configureForSelectAction:acoSelectAction rootView:rootView];

    [cell configureLayoutAndVisibility:rootView.context.verticalContentAlignment
                             minHeight:cellElement->GetMinHeight()
                            heightType:GetACRHeight(cellElement->GetHeight())
                                  type:ACRContainer];

    return cell;
}


@end
