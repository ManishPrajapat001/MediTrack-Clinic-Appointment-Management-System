package Repositories;

import Entity.BillSummary;
import util.DataStore;

import java.util.List;

public class BillSummaryRepo {
    private final DataStore<BillSummary> billSummaryDataStore = new DataStore<>();


    public void addSummary(BillSummary billSummary) {
        billSummaryDataStore.add(billSummary);
    }

    // Get summary by billId
    public BillSummary getByBillId(String billId) {
        for (BillSummary s : billSummaryDataStore.getAll()) {
            if (s.getBillId().equals(billId)) {
                return s;
            }
        }
        return null;
    }

    // Get all summaries
    public List<BillSummary> getAllSummaries() {
        return billSummaryDataStore.getAll();
    }
}
