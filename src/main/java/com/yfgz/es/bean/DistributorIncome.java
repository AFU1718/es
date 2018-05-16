package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/3.
 */
public class DistributorIncome extends BaseBean {

    private Integer distributorId;
    private Double total;//总收入
    private Double balance;//余额
    private Double withdrawed;//已提现
    private Double withdrawing;//提现中
    private Integer version;

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawed() {
        return withdrawed;
    }

    public void setWithdrawed(Double withdrawed) {
        this.withdrawed = withdrawed;
    }

    public Double getWithdrawing() {
        return withdrawing;
    }

    public void setWithdrawing(Double withdrawing) {
        this.withdrawing = withdrawing;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
