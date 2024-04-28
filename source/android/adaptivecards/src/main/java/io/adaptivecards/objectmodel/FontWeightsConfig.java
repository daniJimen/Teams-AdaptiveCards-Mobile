/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FontWeightsConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FontWeightsConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FontWeightsConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(FontWeightsConfig obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FontWeightsConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FontWeightsConfig() {
    this(AdaptiveCardObjectModelJNI.new_FontWeightsConfig__SWIG_0(), true);
  }

  public FontWeightsConfig(long lighterWeight, long defaultWeight, long bolderWeight) {
    this(AdaptiveCardObjectModelJNI.new_FontWeightsConfig__SWIG_1(lighterWeight, defaultWeight, bolderWeight), true);
  }

  public static FontWeightsConfig Deserialize(JsonValue json, FontWeightsConfig defaultValue) {
    return new FontWeightsConfig(AdaptiveCardObjectModelJNI.FontWeightsConfig_Deserialize(JsonValue.getCPtr(json), json, FontWeightsConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public static long GetDefaultFontWeight(TextWeight weight) {
    return AdaptiveCardObjectModelJNI.FontWeightsConfig_GetDefaultFontWeight(weight.swigValue());
  }

  public long GetFontWeight(TextWeight weight) {
    return AdaptiveCardObjectModelJNI.FontWeightsConfig_GetFontWeight(swigCPtr, this, weight.swigValue());
  }

  public void SetFontWeight(TextWeight weight, long value) {
    AdaptiveCardObjectModelJNI.FontWeightsConfig_SetFontWeight(swigCPtr, this, weight.swigValue(), value);
  }

}
