package vczhou.therockwall;

import vczhou.therockwall.Route;

import java.util.*;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class RouteContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Route> ITEMS = new ArrayList<Route>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Route> ITEM_MAP = new HashMap<String, Route>();

    static {
        // Add 3 sample items.
        Date now = new Date();
        addItem(new Route("Scuba Diver", "v3", now, "woohoo"));
        addItem(new Route("Paper Wingz", "v3", now, "yay"));
        addItem(new Route("Mr. Maseeks", "v3", now, "lols"));
    }

    private static void addItem(Route item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getName(), item);
    }
}
