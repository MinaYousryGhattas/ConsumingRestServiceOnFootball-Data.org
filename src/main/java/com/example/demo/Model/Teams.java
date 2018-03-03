package com.example.demo.Model;

/**
 * Created by Mina_Yousry on 27/02/2018.
 */
public class Teams {
    Links _links;
//    String id;
    String name;
    String code;
    String shortName;

    public String getName() {
        return name;
    }


    public Links get_links() {
        return _links;
    }

    public void set_links(Links _link) {
        this._links = _link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//        int pos = _links.self.href.lastIndexOf("/");
//        id = _links.self.href.substring(pos);
//    }

}