package controllers;

import static play.mvc.Results.TODO;
import static play.libs.Json.toJson;
import play.mvc.Controller;
import play.mvc.Result;
import models.Contact;
import java.util.List;
import java.util.ArrayList;

public final class HomeController extends Controller {
    
    public final Result index() {
        return ok("Ok");
    }

    public final Result ping() {
        return ok("ping");
    }

    public Result demo() {
        return TODO;
    }

    public Result contactList() {
        final List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "John Doe", "john@doe.com"));
        list.add(new Contact(2, "Alice Smith", "alice.smith@yahoo.com"));
        list.add(new Contact(3, "Michael Douglas", "m.douglas@outlook.com"));
        list.add(new Contact(4, "Professor Xavier", "xavier.prof@xmen.com"));
        list.add(new Contact(5, "Sheldon Cooper", "sheldo.cooper@warner.com"));

        list.add(new Contact(6, "John Doe", "john@doe.com"));
        list.add(new Contact(7, "Alice Smith", "alice.smith@yahoo.com"));
        list.add(new Contact(8, "Michael Douglas", "m.douglas@outlook.com"));
        list.add(new Contact(9, "Professor Xavier", "xavier.prof@xmen.com"));
        list.add(new Contact(10, "Sheldon Cooper", "sheldo.cooper@warner.com"));

        list.add(new Contact(11, "John Doe", "john@doe.com"));
        list.add(new Contact(12, "Alice Smith", "alice.smith@yahoo.com"));
        list.add(new Contact(13, "Michael Douglas", "m.douglas@outlook.com"));
        list.add(new Contact(14, "Professor Xavier", "xavier.prof@xmen.com"));
        list.add(new Contact(15, "Sheldon Cooper", "sheldo.cooper@warner.com"));

        list.add(new Contact(16, "John Doe", "john@doe.com"));
        list.add(new Contact(17, "Alice Smith", "alice.smith@yahoo.com"));
        list.add(new Contact(18, "Michael Douglas", "m.douglas@outlook.com"));
        list.add(new Contact(19, "Professor Xavier", "xavier.prof@xmen.com"));
        list.add(new Contact(20, "Sheldon Cooper", "sheldo.cooper@warner.com"));
        return ok(toJson(list));
    }

}
