package cis3334.java_pizzaorderstart;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import cis3334.java_pizzaorderstart.Pizza;

@Dao
public interface PizzaDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Pizza pizza);

    @Query("DELETE FROM pizza_table")
    void deleteAll();

    @Query("SELECT * FROM Pizza")
    List<Pizza> getAllPizzas();
}
