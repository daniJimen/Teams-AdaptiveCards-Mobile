/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class IconInfo {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected IconInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IconInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_IconInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IconInfo() {
    this(AdaptiveCardObjectModelJNI.new_IconInfo__SWIG_0(), true);
  }

  public IconInfo(IconInfo arg0) {
    this(AdaptiveCardObjectModelJNI.new_IconInfo__SWIG_1(IconInfo.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.IconInfo_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static IconInfo Deserialize(JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.IconInfo_Deserialize(JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new IconInfo(cPtr, true);
  }

  public String GetSVGPath() {
    return AdaptiveCardObjectModelJNI.IconInfo_GetSVGPath(swigCPtr, this);
  }

  public ForegroundColor getForgroundColor() {
    return ForegroundColor.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_getForgroundColor(swigCPtr, this));
  }

  public void setForgroundColor(ForegroundColor value) {
    AdaptiveCardObjectModelJNI.IconInfo_setForgroundColor(swigCPtr, this, value.swigValue());
  }

  public IconSize getIconSize() {
    return IconSize.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_getIconSize(swigCPtr, this));
  }

  public void setIconSize(IconSize value) {
    AdaptiveCardObjectModelJNI.IconInfo_setIconSize(swigCPtr, this, value.swigValue());
  }

  public IconStyle getIconStyle() {
    return IconStyle.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_getIconStyle(swigCPtr, this));
  }

  public void setIconStyle(IconStyle value) {
    AdaptiveCardObjectModelJNI.IconInfo_setIconStyle(swigCPtr, this, value.swigValue());
  }

  public String GetName() {
    return AdaptiveCardObjectModelJNI.IconInfo_GetName(swigCPtr, this);
  }

  public void SetName(String value) {
    AdaptiveCardObjectModelJNI.IconInfo_SetName(swigCPtr, this, value);
  }

  public void setM_foregroundColor(ForegroundColor value) {
    AdaptiveCardObjectModelJNI.IconInfo_m_foregroundColor_set(swigCPtr, this, value.swigValue());
  }

  public ForegroundColor getM_foregroundColor() {
    return ForegroundColor.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_m_foregroundColor_get(swigCPtr, this));
  }

  public void setM_iconStyle(IconStyle value) {
    AdaptiveCardObjectModelJNI.IconInfo_m_iconStyle_set(swigCPtr, this, value.swigValue());
  }

  public IconStyle getM_iconStyle() {
    return IconStyle.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_m_iconStyle_get(swigCPtr, this));
  }

  public void setM_iconSize(IconSize value) {
    AdaptiveCardObjectModelJNI.IconInfo_m_iconSize_set(swigCPtr, this, value.swigValue());
  }

  public IconSize getM_iconSize() {
    return IconSize.swigToEnum(AdaptiveCardObjectModelJNI.IconInfo_m_iconSize_get(swigCPtr, this));
  }

  public void setM_name(String value) {
    AdaptiveCardObjectModelJNI.IconInfo_m_name_set(swigCPtr, this, value);
  }

  public String getM_name() {
    return AdaptiveCardObjectModelJNI.IconInfo_m_name_get(swigCPtr, this);
  }

  public static IconInfo dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.IconInfo_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new IconInfo(cPtr, true);
  }

}
