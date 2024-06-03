/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class HostWidthConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HostWidthConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HostWidthConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(HostWidthConfig obj) {
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
        AdaptiveCardObjectModelJNI.delete_HostWidthConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVeryNarrow(long value) {
    AdaptiveCardObjectModelJNI.HostWidthConfig_veryNarrow_set(swigCPtr, this, value);
  }

  public long getVeryNarrow() {
    return AdaptiveCardObjectModelJNI.HostWidthConfig_veryNarrow_get(swigCPtr, this);
  }

  public void setNarrow(long value) {
    AdaptiveCardObjectModelJNI.HostWidthConfig_narrow_set(swigCPtr, this, value);
  }

  public long getNarrow() {
    return AdaptiveCardObjectModelJNI.HostWidthConfig_narrow_get(swigCPtr, this);
  }

  public void setStandard(long value) {
    AdaptiveCardObjectModelJNI.HostWidthConfig_standard_set(swigCPtr, this, value);
  }

  public long getStandard() {
    return AdaptiveCardObjectModelJNI.HostWidthConfig_standard_get(swigCPtr, this);
  }

  public static HostWidthConfig Deserialize(JsonValue json, HostWidthConfig defaultValue) {
    return new HostWidthConfig(AdaptiveCardObjectModelJNI.HostWidthConfig_Deserialize(JsonValue.getCPtr(json), json, HostWidthConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public HostWidthConfig() {
    this(AdaptiveCardObjectModelJNI.new_HostWidthConfig(), true);
  }

}
