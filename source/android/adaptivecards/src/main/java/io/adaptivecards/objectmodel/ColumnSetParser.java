/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ColumnSetParser extends BaseCardElementParser {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ColumnSetParser(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ColumnSetParser_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColumnSetParser obj) {
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
        AdaptiveCardObjectModelJNI.delete_ColumnSetParser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ColumnSetParser() {
    this(AdaptiveCardObjectModelJNI.new_ColumnSetParser__SWIG_0(), true);
  }

  public ColumnSetParser(ColumnSetParser arg0) {
    this(AdaptiveCardObjectModelJNI.new_ColumnSetParser__SWIG_1(ColumnSetParser.getCPtr(arg0), arg0), true);
  }

  public BaseCardElement Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.ColumnSetParser_Deserialize(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public BaseCardElement DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ColumnSetParser_DeserializeFromString(swigCPtr, this, ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

}
