package entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class TBlueprintInspect implements Serializable {

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
    private entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect;

    /** nullable persistent field */
    private entity.TBlueprintDeviceInspect TBlueprintDeviceInspect;

    /** full constructor */
    public TBlueprintInspect(String snBlueprint, Blob bigImage, Clob bigDoc, String docType, entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect, entity.TBlueprintDeviceInspect TBlueprintDeviceInspect) {
        this.snBlueprint = snBlueprint;
        this.bigImage = bigImage;
        this.bigDoc = bigDoc;
        this.docType = docType;
        this.TBlueprintJjbaseInspect = TBlueprintJjbaseInspect;
        this.TBlueprintDeviceInspect = TBlueprintDeviceInspect;
    }

    /** default constructor */
    public TBlueprintInspect() {
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

    public entity.TBlueprintJjbaseInspect getTBlueprintJjbaseInspect() {
        return this.TBlueprintJjbaseInspect;
    }

    public void setTBlueprintJjbaseInspect(entity.TBlueprintJjbaseInspect TBlueprintJjbaseInspect) {
        this.TBlueprintJjbaseInspect = TBlueprintJjbaseInspect;
    }

    public entity.TBlueprintDeviceInspect getTBlueprintDeviceInspect() {
        return this.TBlueprintDeviceInspect;
    }

    public void setTBlueprintDeviceInspect(entity.TBlueprintDeviceInspect TBlueprintDeviceInspect) {
        this.TBlueprintDeviceInspect = TBlueprintDeviceInspect;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("idBlueprint", getIdBlueprint())
            .toString();
    }

}
