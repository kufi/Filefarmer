package ch.filefarmer.poso

import com.novus.salat.annotations._
import org.bson.types.ObjectId

case class Archive(@Key("_id")id:ObjectId = new ObjectId(),
    			   identity:String,
    			   name:String,
    			   parentArchiveId: String = "",
    			   fields:scala.collection.mutable.Set[ArchiveField] = collection.mutable.Set[ArchiveField]())