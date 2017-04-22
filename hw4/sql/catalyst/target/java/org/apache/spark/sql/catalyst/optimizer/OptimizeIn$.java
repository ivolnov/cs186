package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Replaces {@link In (value, seq[Literal])} with optimized version{@link InSet (value, HashSet[Literal])}
 * which is much faster
 */
public  class OptimizeIn$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeIn$ MODULE$ = null;
  public   OptimizeIn$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}
