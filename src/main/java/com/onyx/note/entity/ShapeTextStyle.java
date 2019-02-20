package com.onyx.note.entity;

/**
 * <pre>
 *     author : lxw
 *     time   : 2018/9/11 10:32
 *     desc   :
 * </pre>
 */
public class ShapeTextStyle implements Cloneable {

    public static final float DEFAULT_TEXT_SPACING = 1.0f;
    public static final int DEFAULT_TEXT_WIDTH = 300;

    private float textSize;
    private float textSpacing = DEFAULT_TEXT_SPACING;
    private float lineSpacingAdd;
    private boolean textItalic;
    private boolean textBold;
    private boolean textUnderline;
    private int textWidth = DEFAULT_TEXT_WIDTH;
    private float pointScale = 1f;

    public ShapeTextStyle setTextWidth(int textWidth) {
        this.textWidth = textWidth;
        return this;
    }

    public float getTextSize() {
        return textSize;
    }

    public ShapeTextStyle setTextSize(float textSize) {
        this.textSize = textSize;
        return this;
    }

    public float getTextSpacing() {
        return textSpacing;
    }

    public int getTextWidth() {
        return textWidth;
    }

    public ShapeTextStyle setTextSpacing(float textSpacing) {
        this.textSpacing = textSpacing;
        return this;
    }

    public void appendTextWidth(int append) {
        textWidth += append;
    }

    public boolean isTextItalic() {
        return textItalic;
    }

    public ShapeTextStyle setTextItalic(boolean textItalic) {
        this.textItalic = textItalic;
        return this;
    }

    public boolean isTextBold() {
        return textBold;
    }

    public ShapeTextStyle setTextBold(boolean textBold) {
        this.textBold = textBold;
        return this;
    }

    public boolean isTextUnderline() {
        return textUnderline;
    }

    public ShapeTextStyle setTextUnderline(boolean textUnderline) {
        this.textUnderline = textUnderline;
        return this;
    }

    public float getPointScale() {
        return pointScale;
    }

    public ShapeTextStyle setPointScale(float pointScale) {
        this.pointScale = pointScale;
        return this;
    }

    public float getLineSpacingAdd() {
        return lineSpacingAdd;
    }

    public ShapeTextStyle setLineSpacingAdd(float lineSpacingAdd) {
        this.lineSpacingAdd = lineSpacingAdd;
        return this;
    }

    @Override
    public ShapeTextStyle clone(){
        ShapeTextStyle clone = null;
        try {
            clone =  (ShapeTextStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
