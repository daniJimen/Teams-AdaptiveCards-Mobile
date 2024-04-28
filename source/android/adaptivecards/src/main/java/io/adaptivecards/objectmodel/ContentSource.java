/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ContentSource {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ContentSource(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContentSource obj) {
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
        AdaptiveCardObjectModelJNI.delete_ContentSource(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ContentSource_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetMimeType() {
    return AdaptiveCardObjectModelJNI.ContentSource_GetMimeType(swigCPtr, this);
  }

  public void SetMimeType(String value) {
    AdaptiveCardObjectModelJNI.ContentSource_SetMimeType(swigCPtr, this, value);
  }

  public String GetUrl() {
    return AdaptiveCardObjectModelJNI.ContentSource_GetUrl(swigCPtr, this);
  }

  public void SetUrl(String value) {
    AdaptiveCardObjectModelJNI.ContentSource_SetUrl(swigCPtr, this, value);
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceInfo) {
    AdaptiveCardObjectModelJNI.ContentSource_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceInfo), resourceInfo);
  }

  public ContentSource() {
    this(AdaptiveCardObjectModelJNI.new_ContentSource(), true);
  }

}
