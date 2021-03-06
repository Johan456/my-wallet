package al.johan.mywallet.data.db.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "transaction_table")
public class Transaction {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String description;

    private double amount;

    private String creationDate;

    private String category;

    public Transaction(String description, double amount, String creationDate, String category) {
        this.description = description;
        this.amount = amount;
        this.creationDate = creationDate;
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getCategory() {
        return category;
    }
}
