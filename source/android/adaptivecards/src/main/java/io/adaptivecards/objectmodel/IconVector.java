/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class IconVector extends java.util.AbstractList<Icon> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IconVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IconVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IconVector obj) {
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
        AdaptiveCardObjectModelJNI.delete_IconVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IconVector(Icon[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Icon element : initialElements) {
      add(element);
    }
  }

  public IconVector(Iterable<Icon> initialElements) {
    this();
    for (Icon element : initialElements) {
      add(element);
    }
  }

  public Icon get(int index) {
    return doGet(index);
  }

  public Icon set(int index, Icon e) {
    return doSet(index, e);
  }

  public boolean add(Icon e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Icon e) {
    modCount++;
    doAdd(index, e);
  }

  public Icon remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public int capacity() {
    return doCapacity();
  }

  public void reserve(int n) {
    doReserve(n);
  }

  public IconVector() {
    this(AdaptiveCardObjectModelJNI.new_IconVector__SWIG_0(), true);
  }

  public IconVector(IconVector other) {
    this(AdaptiveCardObjectModelJNI.new_IconVector__SWIG_1(IconVector.getCPtr(other), other), true);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.IconVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.IconVector_clear(swigCPtr, this);
  }

  public IconVector(int count, Icon value) {
    this(AdaptiveCardObjectModelJNI.new_IconVector__SWIG_2(count, Icon.getCPtr(value), value), true);
  }

  private int doCapacity() {
    return AdaptiveCardObjectModelJNI.IconVector_doCapacity(swigCPtr, this);
  }

  private void doReserve(int n) {
    AdaptiveCardObjectModelJNI.IconVector_doReserve(swigCPtr, this, n);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.IconVector_doSize(swigCPtr, this);
  }

  private void doAdd(Icon x) {
    AdaptiveCardObjectModelJNI.IconVector_doAdd__SWIG_0(swigCPtr, this, Icon.getCPtr(x), x);
  }

  private void doAdd(int index, Icon x) {
    AdaptiveCardObjectModelJNI.IconVector_doAdd__SWIG_1(swigCPtr, this, index, Icon.getCPtr(x), x);
  }

  private Icon doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.IconVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Icon(cPtr, true);
  }

  private Icon doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.IconVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Icon(cPtr, true);
  }

  private Icon doSet(int index, Icon val) {
    long cPtr = AdaptiveCardObjectModelJNI.IconVector_doSet(swigCPtr, this, index, Icon.getCPtr(val), val);
    return (cPtr == 0) ? null : new Icon(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.IconVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
