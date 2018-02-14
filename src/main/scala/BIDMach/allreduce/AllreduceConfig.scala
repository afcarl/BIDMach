package BIDMach.allreduce

import scala.concurrent.duration._


case class GridMasterConfig(
                             nodeNum: Int,
                             nodeResolutionTimeout: FiniteDuration) {

}

case class ThresholdConfig(
                            thAllreduce: Float,
                            thReduce: Float,
                            thComplete: Float)

case class MetaDataConfig(
                           dataSize: Int,
                           maxChunkSize: Int)

case class LineMasterConfig(
                             workerPerNodeNum: Int,
                             dim: Int,
                             maxRound: Int,
                             discoveryTimeout: FiniteDuration,
                             threshold: ThresholdConfig,
                             metaData: MetaDataConfig)

/**
  * @param dimNum Total number of dimension to which node will create corresponding sets of round workers
  * @param reportStats whether the dimension node will receive stats from its round workers
  */
case class NodeConfig(dimNum: Int, reportStats: Boolean)

case class WorkerConfig(
                         discoveryTimeout: FiniteDuration,
                         statsReportingRoundFrequency: Int = 10,
                         threshold: ThresholdConfig,
                         metaData: MetaDataConfig)

case class DimensionNodeConfig(
                                dim: Int)