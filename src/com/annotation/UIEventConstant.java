package com.annotation;


public class UIEventConstant {
	
	//------addActionListener click---------//
	public static final String EVENT_CLICK = "addActionListener#java.awt.event.ActionListener#actionPerformed";
	
	
	//------addMouseListener mouse---------//
	public static final String EVENT_MOUSE_PRESSED = "addMouseListener#java.awt.event.MouseListener#mousePressed";
	public static final String EVENT_MOUSE_RELEASED = "addMouseListener#java.awt.event.MouseListener#mouseReleased";
	public static final String EVENT_MOUSE_EXITED = "addMouseListener#java.awt.event.MouseListener#mouseExited";
	public static final String EVENT_MOUSE_ENTERED = "addMouseListener#java.awt.event.MouseListener#mouseEntered";
	public static final String EVENT_MOUSE_CLICKED = "addMouseListener#java.awt.event.MouseListener#mouseClicked";
	public static final String EVENT_MOUSE_ALL = "addMouseListener#java.awt.event.MouseListener#ALL_EVENT_METHOD";
	
	//------addMouseMotionListener mouse---------//
	public static final String EVENT_MOUSE_MOTION_ALL = "addMouseMotionListener#java.awt.event.MouseMotionListener#ALL_EVENT_METHOD";
	public static final String EVENT_MOUSE_MOVED = "addMouseMotionListener#java.awt.event.MouseMotionListener#mouseMoved";
	public static final String EVENT_MOUSE_DRAGGED = "addMouseMotionListener#java.awt.event.MouseMotionListener#mouseDragged";
	
	//------addMouseWheelListener mouse---------//
	public static final String EVENT_MOUSE_WHEEL_MOVED = "addMouseWheelListener#java.awt.event.MouseWheelListener#mouseWheelMoved";
	
	//------addKeyListener  KEY---------//
	public static final String EVENT_KEY_TYPED = "addKeyListener#java.awt.event.KeyListener#keyTyped";
	public static final String EVENT_KEY_RELEASED = "addKeyListener#java.awt.event.KeyListener#keyReleased";
	public static final String EVENT_KEY_PRESSED = "addKeyListener#java.awt.event.KeyListener#keyPressed";
	public static final String EVENT_KEY_ALL = "addKeyListener#java.awt.event.KeyListener#ALL_EVENT_METHOD";
	
	//addChangeListener //
	public static final String EVENT_CHANGE_STATE_CHANGED = "addChangeListener#javax.swing.event.ChangeListener#stateChanged";
	
	//addWindowListener //
	public static final String EVENT_WINDOW_OPENED_OPENED = "addWindowListener#java.awt.event.WindowListener#windowOpened";
	public static final String EVENT_WINDOW_ICONIFIED = "addWindowListener#java.awt.event.WindowListener#windowIconified";
	public static final String EVENT_WINDOW_DEICONIFIED = "addWindowListener#java.awt.event.WindowListener#windowDeiconified";
	public static final String EVENT_WINDOW_EACTIVATED = "addWindowListener#java.awt.event.WindowListener#windowDeactivated";
	public static final String EVENT_WINDOW_CLOSING = "addWindowListener#java.awt.event.WindowListener#windowClosing";
	public static final String EVENT_WINDOW_CLOSED = "addWindowListener#java.awt.event.WindowListener#windowClosed";
	public static final String EVENT_WINDOW_ACTIVATED = "addWindowListener#java.awt.event.WindowListener#windowActivated";
	public static final String EVENT_WINDOW_ALL = "addWindowListener#java.awt.event.WindowListener#ALL_EVENT_METHOD";
	
	//addFocusListener //
	public static final String EVENT_FOCUS_LOST = "addFocusListener#java.awt.event.FocusListener#focusLost";
	public static final String EVENT_FOCUS_GAINED = "addFocusListener#java.awt.event.FocusListener#focusGained";
	public static final String EVENT_FOCUS_ALL = "addFocusListener#java.awt.event.FocusListener#ALL_EVENT_METHOD";
	
	//addInputMethodListener //
	public static final String EVENT_INPUT_TEXT_CHANGED = "addInputMethodListener#java.awt.event.InputMethodListener#inputMethodTextChanged";
	public static final String EVENT_INPUT_POSITION_CHANGED = "addInputMethodListener#java.awt.event.InputMethodListener#caretPositionChanged";
	public static final String EVENT_INPUT_ALL = "addInputMethodListener#java.awt.event.InputMethodListener#ALL_EVENT_METHOD";
		
	//addCaretListener  //
	public static final String EVENT_CARET_UPDATE = "addCaretListener#javax.swing.event.CaretListener#caretUpdate";

	//addItemListener //
	public static final String EVENT_ITEM_STATE_CHANGED = "addItemListener#java.awt.event.ItemListener#itemStateChanged";
	
	//addAncestorListener //
	public static final String EVENT_ANCESTOR_REMOVED = "addAncestorListener#javax.swing.event.AncestorListener#ancestorRemoved";
	public static final String EVENT_ANCESTOR_MOVED = "addAncestorListener#javax.swing.event.AncestorListener#ancestorMoved";
	public static final String EVENT_ANCESTOR_ADDED = "addAncestorListener#javax.swing.event.AncestorListener#ancestorAdded";
	public static final String EVENT_ANCESTOR_ALL = "addAncestorListener#javax.swing.event.AncestorListener#ALL_EVENT_METHOD";

	
	//addComponentListener //
	public static final String EVENT_COMPONENT_SHOWN = "addComponentListener#java.awt.event.ComponentListener#componentShown";
	public static final String EVENT_COMPONENT_RESIZED = "addComponentListener#java.awt.event.ComponentListener#componentResized";
	public static final String EVENT_COMPONENT_HIDDEN = "addComponentListener#java.awt.event.ComponentListener#componentHidden";
	public static final String EVENT_COMPONENT_MOVED = "addComponentListener#java.awt.event.ComponentListener#componentMoved";
	public static final String EVENT_COMPONENT_ALL = "addComponentListener#java.awt.event.ComponentListener#ALL_EVENT_METHOD";
	
	//addContainerListener //
	public static final String EVENT_CONTAINER_COMPONENT_REMOVED = "addContainerListener#java.awt.event.ContainerListener#componentRemoved";
	public static final String EVENT_CONTAINER_COMPONENT_ADDED = "addContainerListener#java.awt.event.ContainerListener#componentAdded";
	public static final String EVENT_CONTAINER_ALL = "addContainerListener#java.awt.event.ContainerListener#ALL_EVENT_METHOD";
	
	//addHierarchyListener //
	public static final String EVENT_HIERARCHY_CHANGED = "addHierarchyListener#java.awt.event.HierarchyListener#hierarchyChanged";
	
	//addHierarchyBoundsListener //
	public static final String EVENT_HIERARCHY_BOUNDS_ANCESTOR_RESIZED = "addHierarchyBoundsListener#java.awt.event.HierarchyBoundsListener#ancestorResized";
	public static final String EVENT_HIERARCHY_BOUNDS_ANCESTOR_MOVED = "addHierarchyBoundsListener#java.awt.event.HierarchyBoundsListener#ancestorMoved";
	public static final String EVENT_HIERARCHY_BOUNDS_ALL = "addHierarchyBoundsListener#java.awt.event.HierarchyBoundsListener#ALL_EVENT_METHOD";
	
}
