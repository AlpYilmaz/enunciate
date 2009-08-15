package org.codehaus.enunciate.richdocs.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RichDocs implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    RootPanel loadingText = RootPanel.get("loading");
    if (loadingText != null) {
      loadingText.setVisible(false);
    }
    
    RootPanel bodyPanel = RootPanel.get();

    DockPanel dockPanel = new DockPanel();
    dockPanel.setSize("100%", "100%");
    dockPanel.setSpacing(10);
    bodyPanel.add(dockPanel);

    HTML title = new HTML();
    title.setHTML("<h1>Example API</h1>");
    dockPanel.add(title, DockPanel.NORTH);
    dockPanel.setCellHeight(title, "50px");
    dockPanel.setCellHorizontalAlignment(title, DockPanel.ALIGN_CENTER);

    HTML footer = new HTML();
    footer.setHTML("Documentation generated by <a href=\"http://enunciate.codehaus.org\">Enunciate</a>");
    dockPanel.add(footer, DockPanel.SOUTH);
    dockPanel.setCellHeight(footer, "50px");
    dockPanel.setCellHorizontalAlignment(footer, DockPanel.ALIGN_CENTER);

    Tree menu = new Tree();
    menu.setAnimationEnabled(true);
    menu.setWidth("100%");
    TreeItem soapTree = menu.addItem("SOAP");
    TreeItem wsdl = soapTree.addItem("WSDL One");
    wsdl.addItem("EndpointOneDotOne");
    wsdl.addItem("EndpointOneDotTwo");
    wsdl = soapTree.addItem("WSDL Two");
    wsdl.addItem("EndpointTwoDotOne");
    wsdl.addItem("EndpointTwoDotTwo");
    TreeItem restTree = menu.addItem("REST");
    TreeItem resource = restTree.addItem("Resource One");
    resource.addItem("GET");
    resource.addItem("PUT");
    resource.addItem("POST");
    resource = restTree.addItem("Resource Two");
    resource.addItem("GET");
    TreeItem dataTree = menu.addItem("Data");
    TreeItem ns = dataTree.addItem("Namespace One");
    TreeItem types = ns.addItem("Types");
    types.addItem("TypeOneDotOne");
    types.addItem("TypeOneDotTwo");
    TreeItem elements = ns.addItem("Elements");
    elements.addItem("ElementOneDotOne");
    elements.addItem("ElementOneDotTwo");
    ns = dataTree.addItem("Namespace Two");
    types = ns.addItem("Types");
    types.addItem("TypeTwoDotOne");
    types.addItem("TypeTwoDotTwo");
    elements = ns.addItem("Elements");
    elements.addItem("ElementTwoDotOne");
    elements.addItem("ElementTwoDotTwo");
    dockPanel.add(menu, DockPanel.WEST);
    dockPanel.setCellWidth(menu, "20%");

    DecoratorPanel decorated = new DecoratorPanel();
    HTML elementDocs = new HTML();
    elementDocs.setHTML("whatever! this is some documentation for the 'whatever' element.");
    elementDocs.setWidth("100%");
    decorated.setWidget(elementDocs);
    decorated.setWidth("100%");
    dockPanel.add(decorated, DockPanel.CENTER);
    dockPanel.setCellWidth(decorated, "80%");

  }
}