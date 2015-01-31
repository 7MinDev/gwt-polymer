package com.sevenmindev.gwtpolymer.client.polymerstubs;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.sevenmindev.gwtpolymer.client.myelemental.HTMLElement;

@JsType
public interface CoreDrawerPanel extends HTMLElement {

  @JsProperty void setForceNarrow(boolean narrow);
  
  // TODO(digi): Rename to isNarrow() when JsType parsing allows.
  @JsProperty boolean getNarrow();
  
  @JsProperty String getSelected();
  @JsProperty void setSelected(String selected);

  void closeDrawer();
  void openDrawer();
  void togglePanel();
}
