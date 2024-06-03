/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ExecuteActionParser extends ActionElementParser {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ExecuteActionParser(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ExecuteActionParser_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExecuteActionParser obj) {
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
        AdaptiveCardObjectModelJNI.delete_ExecuteActionParser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExecuteActionParser() {
    this(AdaptiveCardObjectModelJNI.new_ExecuteActionParser__SWIG_0(), true);
  }

  public ExecuteActionParser(ExecuteActionParser arg0) {
    this(AdaptiveCardObjectModelJNI.new_ExecuteActionParser__SWIG_1(ExecuteActionParser.getCPtr(arg0), arg0), true);
  }

  public BaseActionElement Deserialize(ParseContext context, JsonValue value) {
    long cPtr = AdaptiveCardObjectModelJNI.ExecuteActionParser_Deserialize(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(value), value);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public BaseActionElement DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ExecuteActionParser_DeserializeFromString(swigCPtr, this, ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

}
