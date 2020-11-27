public class Thing {

    private String type;
    private String description;
    private String action;
    private String how;

    public Thing(String retype) {
        type = retype;
    }

    public Thing(String retype, String desc) {
        type = retype;
        description = desc;
    }

    public Thing(String retype, String desc, String act) {
        type = retype;
        action = act;
        description = desc;
    }

    public Thing(String retype, String desc, String act, String so) {
        type = retype;
        action = act;
        description = desc;
        how = so;
    }

    public String getName() {
        return type;
    }

    public String getDescription() {
        return description == null ? "" : description;

    }

    public String getAction() {
        return action == null ? "" : action;
    }

    public String getHow() {
        return how == null ? "" : how;
    }


}
