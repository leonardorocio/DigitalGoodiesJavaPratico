package digitalgoodies;

import java.math.BigDecimal;
import java.nio.file.Path;

class Product {
    private String name;
    private Path file;
    private BigDecimal price;

    public Product(String name, Path file, BigDecimal price ) {
        this.name = name;
        this.file = file;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Path getFile() {
        return this.file;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String toString() {
        return this.name;
    }
}