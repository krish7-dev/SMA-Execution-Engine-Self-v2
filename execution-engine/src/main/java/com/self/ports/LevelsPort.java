package com.self.ports;

import com.self.domain.Instrument;
import com.self.domain.Level;

import java.util.List;

public interface LevelsPort {
    List<Level> getLevels(Instrument instrument);
    void setLevels(Instrument instrument, List<Level> levels);
}
