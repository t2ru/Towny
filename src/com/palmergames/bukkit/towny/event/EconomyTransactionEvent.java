package com.palmergames.bukkit.towny.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import com.palmergames.bukkit.towny.object.TownyEconomyObject;

/**
 * Author: Tetsuya Takatsuru (taka2ru)
 * Date 6/23/2012
 */
public class EconomyTransactionEvent extends Event {
    public static final HandlerList handlers = new HandlerList();
    private final TownyEconomyObject from;
    private final TownyEconomyObject to;
    private final double amount;
    private final String reason;

    public EconomyTransactionEvent(TownyEconomyObject from, double amount, TownyEconomyObject to, String reason) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.reason = reason;
    }

    public TownyEconomyObject getFrom() {
        return from;
    }

    public TownyEconomyObject getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

