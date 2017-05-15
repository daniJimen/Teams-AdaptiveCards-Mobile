/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class TextBlockOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextBlockOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextBlockOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_TextBlockOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSmallSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.TextBlockOptions_smallSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getSmallSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlockOptions_smallSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public void setNormalSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.TextBlockOptions_normalSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getNormalSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlockOptions_normalSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public void setMediumSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.TextBlockOptions_mediumSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getMediumSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlockOptions_mediumSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public void setLargeSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.TextBlockOptions_largeSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getLargeSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlockOptions_largeSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public void setExtraLargeSeparation(SeparationOptions value) {
    AdaptiveCardObjectModelJNI.TextBlockOptions_extraLargeSeparation_set(swigCPtr, this, SeparationOptions.getCPtr(value), value);
  }

  public SeparationOptions getExtraLargeSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlockOptions_extraLargeSeparation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationOptions(cPtr, false);
  }

  public TextBlockOptions() {
    this(AdaptiveCardObjectModelJNI.new_TextBlockOptions(), true);
  }

}
