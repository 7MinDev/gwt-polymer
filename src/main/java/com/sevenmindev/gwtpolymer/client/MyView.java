package com.sevenmindev.gwtpolymer.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.sevenmindev.gwtpolymer.client.myelemental.Event;
import com.sevenmindev.gwtpolymer.client.myelemental.EventListener;
import com.sevenmindev.gwtpolymer.client.polymerstubs.CoreDrawerPanel;
import com.sevenmindev.gwtpolymer.client.polymerstubs.CoreIconButton;
import com.sevenmindev.gwtpolymer.client.polymerstubs.CoreResponsiveChangeEvent;

public class MyView extends Composite {

  interface Binder extends UiBinder<HTMLPanel, MyView> {}
  private static Binder binder = GWT.create(Binder.class);

 @UiField
 CoreIconButton menuButton;
  
  @UiField
  CoreIconButton starButton;
  
  @UiField
  CoreDrawerPanel drawerPanel;
  
  public MyView() {
    initWidget(binder.createAndBindUi(this));
    
    menuButton.setHidden(!drawerPanel.getNarrow());

    menuButton.addEventListener("click", new EventListener() {
      @Override 
      public void handleEvent(Event event) {
          drawerPanel.togglePanel();
      }
    });

    starButton.addEventListener("click", new EventListener() {
      @Override 
      public void handleEvent(Event event) {
        Window.alert("You pressed the star!");
      }
    });
    
    drawerPanel.addEventListener("core-responsive-change", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        boolean isNowNarrow = ((CoreResponsiveChangeEvent) event).getDetail().getNarrow();
        menuButton.setHidden(!isNowNarrow);
      }
    });
  }
}
