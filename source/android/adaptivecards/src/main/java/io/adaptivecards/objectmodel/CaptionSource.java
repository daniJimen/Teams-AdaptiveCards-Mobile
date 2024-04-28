/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class CaptionSource extends ContentSource {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CaptionSource(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.CaptionSource_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CaptionSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_CaptionSource(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.CaptionSource_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetLabel() {
    return AdaptiveCardObjectModelJNI.CaptionSource_GetLabel(swigCPtr, this);
  }

  public void SetLabel(String value) {
    AdaptiveCardObjectModelJNI.CaptionSource_SetLabel(swigCPtr, this, value);
  }

  public CaptionSource() {
    this(AdaptiveCardObjectModelJNI.new_CaptionSource(), true);
  }

}
