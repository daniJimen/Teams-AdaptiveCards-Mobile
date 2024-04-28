/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class AdaptiveCard {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected AdaptiveCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_AdaptiveCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AdaptiveCard() {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_0(), true);
  }

  public AdaptiveCard(String version, String fallbackText, String backgroundImageUrl, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_1(version, fallbackText, backgroundImageUrl, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight), true);
  }

  public AdaptiveCard(String version, String fallbackText, String backgroundImageUrl, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight, BaseCardElementVector body, BaseActionElementVector actions) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_2(version, fallbackText, backgroundImageUrl, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions), true);
  }

  public AdaptiveCard(String version, String fallbackText, BackgroundImage backgroundImage, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_3(version, fallbackText, BackgroundImage.getCPtr(backgroundImage), backgroundImage, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight), true);
  }

  public AdaptiveCard(String version, String fallbackText, BackgroundImage backgroundImage, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight, BaseCardElementVector body, BaseActionElementVector actions) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_4(version, fallbackText, BackgroundImage.getCPtr(backgroundImage), backgroundImage, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions), true);
  }

  public AdaptiveCard(String version, String fallbackText, BackgroundImage backgroundImage, Refresh refresh, Authentication authentication, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight, BaseCardElementVector body, BaseActionElementVector actions) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_5(version, fallbackText, BackgroundImage.getCPtr(backgroundImage), backgroundImage, Refresh.getCPtr(refresh), refresh, Authentication.getCPtr(authentication), authentication, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions), true);
  }

  public AdaptiveCard(String version, String fallbackText, BackgroundImage backgroundImage, Refresh refresh, Authentication authentication, ContainerStyle style, String speak, String language, VerticalContentAlignment verticalContentAlignment, HeightType height, long minHeight, BaseCardElementVector body, BaseActionElementVector actions, SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t p_requires, BaseElement fallbackContent, SWIGTYPE_p_AdaptiveCards__FallbackType fallbackType) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCard__SWIG_6(version, fallbackText, BackgroundImage.getCPtr(backgroundImage), backgroundImage, Refresh.getCPtr(refresh), refresh, Authentication.getCPtr(authentication), authentication, style.swigValue(), speak, language, verticalContentAlignment.swigValue(), height.swigValue(), minHeight, BaseCardElementVector.getCPtr(body), body, BaseActionElementVector.getCPtr(actions), actions, SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t.getCPtr(p_requires), BaseElement.getCPtr(fallbackContent), fallbackContent, SWIGTYPE_p_AdaptiveCards__FallbackType.getCPtr(fallbackType)), true);
  }

  public String GetVersion() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetVersion(swigCPtr, this);
  }

  public void SetVersion(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetVersion(swigCPtr, this, value);
  }

  public String GetFallbackText() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetFallbackText(swigCPtr, this);
  }

  public void SetFallbackText(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetFallbackText(swigCPtr, this, value);
  }

  public BackgroundImage GetBackgroundImage() {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_GetBackgroundImage(swigCPtr, this);
    return (cPtr == 0) ? null : new BackgroundImage(cPtr, true);
  }

  public void SetBackgroundImage(BackgroundImage value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetBackgroundImage(swigCPtr, this, BackgroundImage.getCPtr(value), value);
  }

  public Refresh GetRefresh() {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_GetRefresh(swigCPtr, this);
    return (cPtr == 0) ? null : new Refresh(cPtr, true);
  }

  public void SetRefresh(Refresh value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetRefresh(swigCPtr, this, Refresh.getCPtr(value), value);
  }

  public Authentication GetAuthentication() {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_GetAuthentication(swigCPtr, this);
    return (cPtr == 0) ? null : new Authentication(cPtr, true);
  }

  public void SetAuthentication(Authentication value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetAuthentication(swigCPtr, this, Authentication.getCPtr(value), value);
  }

  public String GetSpeak() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetSpeak(swigCPtr, this);
  }

  public void SetSpeak(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetSpeak(swigCPtr, this, value);
  }

  public ContainerStyle GetStyle() {
    return ContainerStyle.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetStyle(swigCPtr, this));
  }

  public void SetStyle(ContainerStyle value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetStyle(swigCPtr, this, value.swigValue());
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetLanguage(swigCPtr, this);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetLanguage(swigCPtr, this, value);
  }

  public VerticalContentAlignment GetVerticalContentAlignment() {
    return VerticalContentAlignment.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetVerticalContentAlignment(swigCPtr, this));
  }

  public void SetVerticalContentAlignment(VerticalContentAlignment value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetVerticalContentAlignment(swigCPtr, this, value.swigValue());
  }

  public HeightType GetHeight() {
    return HeightType.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetHeight(swigCPtr, this));
  }

  public void SetHeight(HeightType value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetHeight(swigCPtr, this, value.swigValue());
  }

  public long GetMinHeight() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_GetMinHeight(swigCPtr, this);
  }

  public void SetMinHeight(long value) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetMinHeight(swigCPtr, this, value);
  }

  public @androidx.annotation.Nullable Boolean GetRtl() {
    StdOptionalBool optvalue = new StdOptionalBool(AdaptiveCardObjectModelJNI.AdaptiveCard_GetRtl(swigCPtr, this), false);
    return optvalue.has_value() ? optvalue.value() : null;
  }

  public void SetRtl(@androidx.annotation.Nullable Boolean value) {
    StdOptionalBool optvalue = (value == null) ? new StdOptionalBool() : new StdOptionalBool(value);
    {
      AdaptiveCardObjectModelJNI.AdaptiveCard_SetRtl(swigCPtr, this, StdOptionalBool.getCPtr(optvalue), optvalue);
    }
  }

  public BaseActionElement GetSelectAction() {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_GetSelectAction(swigCPtr, this);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public void SetSelectAction(BaseActionElement action) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetSelectAction(swigCPtr, this, BaseActionElement.getCPtr(action), action);
  }

  public BaseCardElementVector GetBody() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetBody__SWIG_0(swigCPtr, this), false);
  }

  public BaseActionElementVector GetActions() {
    return new BaseActionElementVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetActions__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__unordered_setT_std__string_t GetKnownProperties() {
    return new SWIGTYPE_p_std__unordered_setT_std__string_t(AdaptiveCardObjectModelJNI.AdaptiveCard_GetKnownProperties(swigCPtr, this), false);
  }

  public JsonValue GetAdditionalProperties() {
    return new JsonValue(AdaptiveCardObjectModelJNI.AdaptiveCard_GetAdditionalProperties(swigCPtr, this), false);
  }

  public void SetAdditionalProperties(JsonValue additionalProperties) {
    AdaptiveCardObjectModelJNI.AdaptiveCard_SetAdditionalProperties__SWIG_0(swigCPtr, this, JsonValue.swigRelease(additionalProperties), additionalProperties);
  }

  public RemoteResourceInformationVector GetResourceInformation() {
    return new RemoteResourceInformationVector(AdaptiveCardObjectModelJNI.AdaptiveCard_GetResourceInformation(swigCPtr, this), true);
  }

  public CardElementType GetElementType() {
    return CardElementType.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetElementType(swigCPtr, this));
  }

  public SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t GetRootRequires() {
    return new SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t(AdaptiveCardObjectModelJNI.AdaptiveCard_GetRootRequires__SWIG_0(swigCPtr, this), false);
  }

  public BaseElement GetRootFallbackContent() {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_GetRootFallbackContent(swigCPtr, this);
    return (cPtr == 0) ? null : new BaseElement(cPtr, true);
  }

  public FallbackType GetRootFallbackType() {
    return FallbackType.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCard_GetRootFallbackType(swigCPtr, this));
  }

  public static ParseResult DeserializeFromFile(String jsonFile, String rendererVersion, ParseContext context) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile__SWIG_0(jsonFile, rendererVersion, ParseContext.getCPtr(context), context);
    return (cPtr == 0) ? null : new ParseResult(cPtr, true);
  }

  public static ParseResult DeserializeFromFile(String jsonFile, String rendererVersion) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromFile__SWIG_1(jsonFile, rendererVersion);
    return (cPtr == 0) ? null : new ParseResult(cPtr, true);
  }

  public static ParseResult Deserialize(JsonValue json, String rendererVersion, ParseContext context) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_Deserialize(JsonValue.getCPtr(json), json, rendererVersion, ParseContext.getCPtr(context), context);
    return (cPtr == 0) ? null : new ParseResult(cPtr, true);
  }

  public static ParseResult DeserializeFromString(String jsonString, String rendererVersion, ParseContext context) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString__SWIG_0(jsonString, rendererVersion, ParseContext.getCPtr(context), context);
    return (cPtr == 0) ? null : new ParseResult(cPtr, true);
  }

  public static ParseResult DeserializeFromString(String jsonString, String rendererVersion) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_DeserializeFromString__SWIG_1(jsonString, rendererVersion);
    return (cPtr == 0) ? null : new ParseResult(cPtr, true);
  }

  public static AdaptiveCard MakeFallbackTextCard(String fallbackText, String language, String speak) throws java.io.IOException {
    long cPtr = AdaptiveCardObjectModelJNI.AdaptiveCard_MakeFallbackTextCard(fallbackText, language, speak);
    return (cPtr == 0) ? null : new AdaptiveCard(cPtr, true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.AdaptiveCard_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_Serialize(swigCPtr, this);
  }

  public InternalId GetInternalId() {
    return new InternalId(AdaptiveCardObjectModelJNI.AdaptiveCard_GetInternalId(swigCPtr, this), true);
  }

  public static SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t GetFeaturesSupported() {
    return new SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t(AdaptiveCardObjectModelJNI.AdaptiveCard_GetFeaturesSupported(), true);
  }

  public static boolean MeetsRootRequirements(SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t requiresSet) {
    return AdaptiveCardObjectModelJNI.AdaptiveCard_MeetsRootRequirements(SWIGTYPE_p_std__unordered_mapT_std__string_AdaptiveCards__SemanticVersion_t.getCPtr(requiresSet));
  }

}
