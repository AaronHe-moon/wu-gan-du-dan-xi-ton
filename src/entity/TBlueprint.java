package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TBlueprint implements Serializable {

    /** identifier field */
    private Integer idBlueprint;

    /** nullable persistent field */
    private String snBlueprint;

    /** nullable persistent field */
    private Blob bigImage;

    /** nullable persistent field */
    private Clob bigDoc;

    /** nullable persistent field */
    private String docType;

    /** nullable persistent field */
    private String spNotes;

    /** nullable persistent field */
    private entity.TBlueprintJjbase TBlueprintJjbase;

    /** nullable persistent field */
    private entity.TBlueprintDevice TBlueprintDevice;

    /** full constructor */
    public TBlueprint(String snBlueprint, Blob bigImage, Clob bigDoc, String docType, String spNotes, entity.TBlueprintJjbase TBlueprintJjbase, entity.TBlueprintDevice TBlueprintDevice) {
        this.snBlueprint = snBlueprint;
        this.bigImage = bigImage;
        this.bigDoc = bigDoc;
        this.docType = docType;
        this.spNotes = spNotes;
        this.TBlueprintJjbase = TBlueprintJjbase;
        this.TBlueprintDevice = TBlueprintDevice;
    }

    /** default constructor */
    public TBlueprint() {
    }

    public Integer getIdBlueprint() {
        return this.idBlueprint;
    }

    public void setIdBlueprint(Integer idBlueprint) {
        this.idBlueprint = idBlueprint;
    }

    public String getSnBlueprint() {
        return this.snBlueprint;
    }

    public void setSnBlueprint(String snBlueprint) {
        this.snBlueprint = snBlueprint;
    }

    public Blob getBigImage() {
        return this.bigImage;
    }

    public void setBigImage(Blob bigImage) {
        this.bigImage = bigImage;
    }

    public Clob getBigDoc() {
        return this.bigDoc;
    }

    public void setBigDoc(Clob bigDoc) {
        this.bigDoc = bigDoc;
    }

    public String getDocType() {
        return this.docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getSpNotes() {
        return this.spNotes;
    }

    public void setSpNotes(String spNotes) {
        this.spNotes = spNotes;
    }

    public entity.TBlueprintJjbase getTBlueprintJjbase() {
        return this.TBlueprintJjbase;
    }

    public void setTBlueprintJjbase(entity.TBlueprintJjbase TBlueprintJjbase) {
        this.TBlueprintJjbase = TBlueprintJjbase;
    }

    public entity.TBlueprintDevice getTBlueprintDevice() {
        return this.TBlueprintDevice;
    }

    public void setTBlueprintDevice(entity.TBlueprintDevice TBlueprintDevice) {
        this.TBlueprintDevice = TBlueprintDevice;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("idBlueprint", getIdBlueprint())
            .toString();
    }

}
