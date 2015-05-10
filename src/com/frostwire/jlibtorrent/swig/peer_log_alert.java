/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_log_alert extends peer_alert {
  private long swigCPtr;

  protected peer_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.peer_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.peer_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.peer_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.peer_log_alert_message(swigCPtr, this);
  }

  public void setEvent_type(String value) {
    libtorrent_jni.peer_log_alert_event_type_set(swigCPtr, this, value);
  }

  public String getEvent_type() {
    return libtorrent_jni.peer_log_alert_event_type_get(swigCPtr, this);
  }

  public void setDirection(peer_log_alert.direction_t value) {
    libtorrent_jni.peer_log_alert_direction_set(swigCPtr, this, value.swigValue());
  }

  public peer_log_alert.direction_t getDirection() {
    return peer_log_alert.direction_t.swigToEnum(libtorrent_jni.peer_log_alert_direction_get(swigCPtr, this));
  }

  public String msg() {
    return libtorrent_jni.peer_log_alert_msg(swigCPtr, this);
  }

  public enum direction_t {
    incoming_message,
    outgoing_message,
    incoming,
    outgoing,
    info;

    public final int swigValue() {
      return swigValue;
    }

    public static direction_t swigToEnum(int swigValue) {
      direction_t[] swigValues = direction_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (direction_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + direction_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private direction_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private direction_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private direction_t(direction_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static int priority = libtorrent_jni.peer_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.peer_log_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.peer_log_alert_static_category_get();
}
