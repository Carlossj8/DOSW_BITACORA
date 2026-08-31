package main.dosw.semana3.ejercicio11;

public class NavigationApp {
    private RouteStrategy routeStrategy;

    public NavigationApp(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void startNavigation() {
        if (routeStrategy != null) {
            routeStrategy.calculateRoute();
        }
    }
}
