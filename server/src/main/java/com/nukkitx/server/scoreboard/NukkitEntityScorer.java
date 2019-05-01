package com.nukkitx.server.scoreboard;

import com.nukkitx.api.entity.Entity;
import com.nukkitx.api.scoreboard.EntityScorer;
import lombok.Getter;

import java.util.Objects;

@Getter
public class NukkitEntityScorer extends NukkitScorer implements EntityScorer {
    private final Entity entity;

    public NukkitEntityScorer(Type type, long id, Entity entity) {
        super(type, id);
        this.entity = entity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        NukkitEntityScorer that = (NukkitEntityScorer) o;
        return Objects.equals(this.getType(), that.getType()) && this.getId() == that.getId() &&
                this.entity == that.entity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), entity);
    }

    @Override
    public String toString() {
        return "NukkitEntityScorer(" + super.toString() + ", entity=" + entity + ')';
    }
}
