/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class JsonValue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected JsonValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JsonValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(JsonValue obj) {
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
        AdaptiveCardObjectModelJNI.delete_JsonValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getString() {
    return AdaptiveCardObjectModelJNI.JsonValue_getString(swigCPtr, this);
  }

  public JsonValue() {
    this(AdaptiveCardObjectModelJNI.new_JsonValue(), true);
  }

}
