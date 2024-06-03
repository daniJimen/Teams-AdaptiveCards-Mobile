/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ElementParserRegistration {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ElementParserRegistration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ElementParserRegistration obj) {
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
        AdaptiveCardObjectModelJNI.delete_ElementParserRegistration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ElementParserRegistration() {
    this(AdaptiveCardObjectModelJNI.new_ElementParserRegistration(), true);
  }

  public void AddParser(String elementType, BaseCardElementParser parser) {
    AdaptiveCardObjectModelJNI.ElementParserRegistration_AddParser(swigCPtr, this, elementType, BaseCardElementParser.getCPtr(parser), parser);
  }

  public void RemoveParser(String elementType) {
    AdaptiveCardObjectModelJNI.ElementParserRegistration_RemoveParser(swigCPtr, this, elementType);
  }

  public BaseCardElementParser GetParser(String elementType) {
    long cPtr = AdaptiveCardObjectModelJNI.ElementParserRegistration_GetParser(swigCPtr, this, elementType);
    return (cPtr == 0) ? null : new BaseCardElementParser(cPtr, true);
  }

}
