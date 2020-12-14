package org.jetBrains.oop.concepts.abstractconcept;

public class OnlineCustomer {

    public static void main(String[] args) {
        User user = new User();
        user.setName("John Grant");

        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);

        WebSite site = new WebSite();
        site.setUrl("https://hyperskill.org");

        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);

        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(site);

        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);

    }

}
class User extends BaseEntity{


}

class Visit extends BaseEntity {



    }

class WebSite extends BaseEntity{


}