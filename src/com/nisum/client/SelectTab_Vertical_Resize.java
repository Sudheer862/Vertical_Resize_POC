package com.nisum.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SelectTab_Vertical_Resize implements EntryPoint {
	private static int last_Size;
	private static int new_Max_Left_Btn = 252;
	private static int new_Max_Right_Btn = 209;
	private static int new_Max_Match_Btn = 362;
	private static int new_Max_AndOr_Btn = 320;
	final int x = 1;
	final Select_Tab tab = new Select_Tab();

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */

	/**
	 * This is the entry point method.
	 */

	// Use JSNI to grab the JSON object we care about
	// The JSON object gets its Java type implicitly
	// based on the method's return type
	/*
	 * private native Object getBrowserHeight() -{ // Get a reference to the
	 * first customer in the JSON array from earlier $wnd.alert(Math.max(
	 * Math.max
	 * (document.body.scrollHeight,document.documentElement.scrollHeight),
	 * Math.max(document.body.offsetHeight,
	 * document.documentElement.offsetHeight),
	 * Math.max(document.body.clientHeight,
	 * document.documentElement.clientHeight))); return "msg";
	 * 
	 * 
	 * }-;
	 */

	void setupSize(int event) {//Window.alert("setup called");

		if (event <= 510) {
			// Window.alert("if");
			// Window.alert("In if block");
			tab.getLeftSideParameterCodesListPanel().setHeight(500 + "px");

			// main panel1
			// tab.getMainPanel().setWidth((1300-260)+"px");
			tab.getRightsidePanel().setHeight(500 + "px");

			// MainPanel

			// tab.getMainPanel().setWidth((1300-206)+"px");
			tab.getMainPanel1().setHeight(500 + "px");

			tab.getMainPanel1().add(tab.getRightMoveBtn(), 307, 200);
			tab.getMainPanel1().add(tab.getMatchBtn(), 307, 350);
			tab.getMainPanel1().add(tab.getAndOrBtn(), 307, 310);
			tab.getMainPanel1().add(tab.getLeftMoveBtn(), 307, 240);
			// Window.alert("Height"+Window.getClientHeight());
		} else  {
			// Window.alert("Height"+Window.getClientHeight());

			if (tab.mainPanel1.getOffsetHeight() < 1000) {
				tab.getLeftSideParameterCodesListPanel().setHeight(
						event - 20 + "px");

				// main panel1
				// tab.getMainPanel().setWidth((1300-260)+"px");
				tab.getRightsidePanel().setHeight(event - 20 + "px");

				// MainPanel

				// tab.getMainPanel().setWidth((1300-206)+"px");
				tab.getMainPanel1().setHeight(event - 20 + "px");
				if (last_Size == 0) {

				} else if (last_Size < event) {
					new_Max_Right_Btn = new_Max_Right_Btn + x;
					new_Max_Match_Btn = new_Max_Match_Btn + x;
					new_Max_AndOr_Btn = new_Max_AndOr_Btn + x;
					new_Max_Left_Btn = new_Max_Left_Btn + x;

					tab.getMainPanel1().add(tab.getRightMoveBtn(), 307,
							new_Max_Right_Btn);
					tab.getMainPanel1().add(tab.getMatchBtn(), 307,
							new_Max_Match_Btn);
					tab.getMainPanel1().add(tab.getAndOrBtn(), 307,
							new_Max_AndOr_Btn);
					tab.getMainPanel1().add(tab.getLeftMoveBtn(), 307,
							new_Max_Left_Btn);
				} else {
					new_Max_Right_Btn = new_Max_Right_Btn - x;
					new_Max_Match_Btn = new_Max_Match_Btn - x;
					new_Max_AndOr_Btn = new_Max_AndOr_Btn - x;
					new_Max_Left_Btn = new_Max_Left_Btn - x;

					tab.getMainPanel1().add(tab.getRightMoveBtn(), 307,
							new_Max_Right_Btn);
					tab.getMainPanel1().add(tab.getMatchBtn(), 307,
							new_Max_Match_Btn);
					tab.getMainPanel1().add(tab.getAndOrBtn(), 307,
							new_Max_AndOr_Btn);
					tab.getMainPanel1().add(tab.getLeftMoveBtn(), 307,
							new_Max_Left_Btn);

				}
				last_Size = event;

			}
		}

	}

	public void onModuleLoad() {

		setupSize(Window.getClientHeight());
		RootLayoutPanel.get().add(tab);
		
		//commit 3
		
		//commit 4
		Window.addResizeHandler(new ResizeHandler() {

			@Override
			public void onResize(ResizeEvent event) {
				setupSize(event.getHeight());
				

			}
		});

	}
}
