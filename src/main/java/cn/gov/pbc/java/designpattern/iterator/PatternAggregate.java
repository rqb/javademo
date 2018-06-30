package cn.gov.pbc.java.designpattern.iterator;

public interface PatternAggregate {
    void addPattern(DesignPattern designPattern);
    void removePattern(DesignPattern designPattern);
    PatternIterator getPatternIterator();
}
