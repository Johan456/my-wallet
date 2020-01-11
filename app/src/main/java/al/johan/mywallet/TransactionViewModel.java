package al.johan.mywallet;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class TransactionViewModel extends AndroidViewModel {
    private TransactionRepository repository;
    private LiveData<List<Transaction>> allTransactions;

    public TransactionViewModel(@NonNull Application application) {
        super(application);
        repository = new TransactionRepository(application);
        allTransactions = repository.getAllTransactions();
    }

    public void insert(Transaction transaction) {
        repository.insert(transaction);
    }

    public void update(Transaction transaction) {
        repository.update(transaction);
    }

    public void delete(Transaction transaction) {
        repository.delete(transaction);
    }

    public LiveData<List<Transaction>> getAllTransactions() {
        return allTransactions;
    }
}
