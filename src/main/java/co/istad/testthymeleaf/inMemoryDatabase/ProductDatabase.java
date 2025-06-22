package co.istad.testthymeleaf.inMemoryDatabase;

import co.istad.testthymeleaf.model.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDatabase {
    public List<Product> getAllProducts() {
        return new ArrayList<>(
                List.of(
                        new Product(
                                1,
                                "Coca",
                                "https://imgs.search.brave.com/r49gevfPFys4yPUwCQbPdis7pHARkVsBHbaARkFkds4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9jZG4u/cGl4YWJheS5jb20v/cGhvdG8vMjAxOS8w/NC8wNC8xMS80Mi9z/b2RhLTQxMDI1OTNf/NjQwLmpwZw",
                                "Soft drink ducvadc",
                                1.5,
                                true
                        ),
                        new Product(
                                2,
                                "Pepsi",
                                "https://imgs.search.brave.com/qsHtJBsJ4KMHqJFMh1bZlJyOheZ03A_dfPv6n7Mag08/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90aHVt/YnMuZHJlYW1zdGlt/ZS5jb20vYi9ib3R0/bGVzLWNhcmJvbmF0/ZWQtc29mdC1kcmlu/ay1wZXBzaS1wb3pu/YW4tcG9sLWRlYy1w/cm9kdWNlZC1tYW51/ZmFjdHVyZWQtcGVw/c2ljby1iZXZlcmFn/ZS13YXMtY3JlYXRl/ZC1kZXZlbG9wZWQt/MTM1OTc1MjM5Lmpw/Zw",
                                "Soft drink vshvbfjdv skcb",
                                2.0,
                                true
                        ),
                        new Product(
                                3,
                                "Pepsi Limited Edition",
                                "https://imgs.search.brave.com/qsHtJBsJ4KMHqJFMh1bZlJyOheZ03A_dfPv6n7Mag08/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90aHVt/YnMuZHJlYW1zdGlt/ZS5jb20vYi9ib3R0/bGVzLWNhcmJvbmF0/ZWQtc29mdC1kcmlu/ay1wZXBzaS1wb3pu/YW4tcG9sLWRlYy1w/cm9kdWNlZC1tYW51/ZmFjdHVyZWQtcGVw/c2ljby1iZXZlcmFn/ZS13YXMtY3JlYXRl/ZC1kZXZlbG9wZWQt/MTM1OTc1MjM5Lmpw/Zw",
                                "Soft drink vshvbfjdv skcb",
                                2.5,
                                true
                        )
                )
        );
    }
}
