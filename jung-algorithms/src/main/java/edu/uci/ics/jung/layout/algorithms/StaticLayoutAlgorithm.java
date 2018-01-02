package edu.uci.ics.jung.layout.algorithms;

import edu.uci.ics.jung.layout.model.LayoutModel;

/**
 * StaticLayout leaves the nodes in the locations specified in the LayoutModel, and has no other
 * behavior.
 *
 * @author Tom Nelson
 */
public class StaticLayoutAlgorithm<N> implements LayoutAlgorithm<N> {

  public void visit(LayoutModel<N> layoutModel) {}

  public void initialize() {}

  public void reset() {}
}
