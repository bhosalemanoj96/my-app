package com.example.application.views.adminview;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Admin view")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 0)
@Route(value = "")
@RouteAlias(value = "")
@RolesAllowed("ADMIN")
public class AdminviewView extends Composite<VerticalLayout> {

    public AdminviewView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
