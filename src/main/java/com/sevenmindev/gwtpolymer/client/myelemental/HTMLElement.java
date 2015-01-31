package com.sevenmindev.gwtpolymer.client.myelemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface HTMLElement extends Node {
  
  @JsProperty void setHidden(boolean visible);
}
