/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum AssociatedInputs {
  Auto(0),
  None;

  public final int swigValue() {
    return swigValue;
  }

  public static AssociatedInputs swigToEnum(int swigValue) {
    AssociatedInputs[] swigValues = AssociatedInputs.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (AssociatedInputs swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + AssociatedInputs.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private AssociatedInputs() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private AssociatedInputs(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private AssociatedInputs(AssociatedInputs swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

