package jiconfont.icons.font_awesome;

import jiconfont.IconCode;
import jiconfont.IconFont;

import java.io.InputStream;

public enum FontAwesomeRegular implements IconCode {
    
    ADDRESS_BOOK('\uF2B9'),
    ADDRESS_CARD('\uF2BB'),
    ANGRY('\uF556'),
    ARROW_ALT_CIRCLE_DOWN('\uF358'),
    ARROW_ALT_CIRCLE_LEFT('\uF359'),
    ARROW_ALT_CIRCLE_RIGHT('\uF35A'),
    ARROW_ALT_CIRCLE_UP('\uF35B'),
    BELL('\uF0F3'),
    BELL_SLASH('\uF1F6'),
    BOOKMARK('\uF02E'),
    BUILDING('\uF1AD'),
    CALENDAR('\uF133'),
    CALENDAR_ALT('\uF073'),
    CALENDAR_CHECK('\uF274'),
    CALENDAR_MINUS('\uF272'),
    CALENDAR_PLUS('\uF271'),
    CALENDAR_TIMES('\uF273'),
    CARET_SQUARE_DOWN('\uF150'),
    CARET_SQUARE_LEFT('\uF191'),
    CARET_SQUARE_RIGHT('\uF152'),
    CARET_SQUARE_UP('\uF151'),
    CHART_BAR('\uF080'),
    CHECK_CIRCLE('\uF058'),
    CHECK_SQUARE('\uF14A'),
    CIRCLE('\uF111'),
    CLIPBOARD('\uF328'),
    CLOCK('\uF017'),
    CLONE('\uF24D'),
    CLOSED_CAPTIONING('\uF20A'),
    COMMENT('\uF075'),
    COMMENT_ALT('\uF27A'),
    COMMENT_DOTS('\uF4AD'),
    COMMENTS('\uF086'),
    COMPASS('\uF14E'),
    COPY('\uF0C5'),
    COPYRIGHT('\uF1F9'),
    CREDIT_CARD('\uF09D'),
    DIZZY('\uF567'),
    DOT_CIRCLE('\uF192'),
    EDIT('\uF044'),
    ENVELOPE('\uF0E0'),
    ENVELOPE_OPEN('\uF2B6'),
    EYE('\uF06E'),
    EYE_SLASH('\uF070'),
    FILE('\uF15B'),
    FILE_ALT('\uF15C'),
    FILE_ARCHIVE('\uF1C6'),
    FILE_AUDIO('\uF1C7'),
    FILE_CODE('\uF1C9'),
    FILE_EXCEL('\uF1C3'),
    FILE_IMAGE('\uF1C5'),
    FILE_PDF('\uF1C1'),
    FILE_POWERPOINT('\uF1C4'),
    FILE_VIDEO('\uF1C8'),
    FILE_WORD('\uF1C2'),
    FLAG('\uF024'),
    FLUSHED('\uF579'),
    FOLDER('\uF07B'),
    FOLDER_OPEN('\uF07C'),
    FROWN('\uF119'),
    FROWN_OPEN('\uF57A'),
    FUTBOL('\uF1E3'),
    GEM('\uF3A5'),
    GRIMACE('\uF57F'),
    GRIN('\uF580'),
    GRIN_ALT('\uF581'),
    GRIN_BEAM('\uF582'),
    GRIN_BEAM_SWEAT('\uF583'),
    GRIN_HEARTS('\uF584'),
    GRIN_SQUINT('\uF585'),
    GRIN_SQUINT_TEARS('\uF586'),
    GRIN_STARS('\uF587'),
    GRIN_TEARS('\uF588'),
    GRIN_TONGUE('\uF589'),
    GRIN_TONGUE_SQUINT('\uF58A'),
    GRIN_TONGUE_WINK('\uF58B'),
    GRIN_WINK('\uF58C'),
    HAND_LIZARD('\uF258'),
    HAND_PAPER('\uF256'),
    HAND_PEACE('\uF25B'),
    HAND_POINT_DOWN('\uF0A7'),
    HAND_POINT_LEFT('\uF0A5'),
    HAND_POINT_RIGHT('\uF0A4'),
    HAND_POINT_UP('\uF0A6'),
    HAND_POINTER('\uF25A'),
    HAND_ROCK('\uF255'),
    HAND_SCISSORS('\uF257'),
    HAND_SPOCK('\uF259'),
    HANDSHAKE('\uF2B5'),
    HDD('\uF0A0'),
    HEART('\uF004'),
    HOSPITAL('\uF0F8'),
    HOURGLASS('\uF254'),
    ID_BADGE('\uF2C1'),
    ID_CARD('\uF2C2'),
    IMAGE('\uF03E'),
    IMAGES('\uF302'),
    KEYBOARD('\uF11C'),
    KISS('\uF596'),
    KISS_BEAM('\uF597'),
    KISS_WINK_HEART('\uF598'),
    LAUGH('\uF599'),
    LAUGH_BEAM('\uF59A'),
    LAUGH_SQUINT('\uF59B'),
    LAUGH_WINK('\uF59C'),
    LEMON('\uF094'),
    LIFE_RING('\uF1CD'),
    LIGHTBULB('\uF0EB'),
    LIST_ALT('\uF022'),
    MAP('\uF279'),
    MEH('\uF11A'),
    MEH_BLANK('\uF5A4'),
    MEH_ROLLING_EYES('\uF5A5'),
    MINUS_SQUARE('\uF146'),
    MONEY_BILL_ALT('\uF3D1'),
    MOON('\uF186'),
    NEWSPAPER('\uF1EA'),
    OBJECT_GROUP('\uF247'),
    OBJECT_UNGROUP('\uF248'),
    PAPER_PLANE('\uF1D8'),
    PAUSE_CIRCLE('\uF28B'),
    PLAY_CIRCLE('\uF144'),
    PLUS_SQUARE('\uF0FE'),
    QUESTION_CIRCLE('\uF059'),
    REGISTERED('\uF25D'),
    SAD_CRY('\uF5B3'),
    SAD_TEAR('\uF5B4'),
    SAVE('\uF0C7'),
    SHARE_SQUARE('\uF14D'),
    SMILE('\uF118'),
    SMILE_BEAM('\uF5B8'),
    SMILE_WINK('\uF4DA'),
    SNOWFLAKE('\uF2DC'),
    SQUARE('\uF0C8'),
    STAR('\uF005'),
    STAR_HALF('\uF089'),
    STICKY_NOTE('\uF249'),
    STOP_CIRCLE('\uF28D'),
    SUN('\uF185'),
    SURPRISE('\uF5C2'),
    THUMBS_DOWN('\uF165'),
    THUMBS_UP('\uF164'),
    TIMES_CIRCLE('\uF057'),
    TIRED('\uF5C8'),
    TRASH_ALT('\uF2ED'),
    USER('\uF007'),
    USER_CIRCLE('\uF2BD'),
    WINDOW_CLOSE('\uF410'),
    WINDOW_MAXIMIZE('\uF2D0'),
    WINDOW_MINIMIZE('\uF2D1'),
    WINDOW_RESTORE('\uF2D2');
    
    private final char character;

    FontAwesomeRegular(char character) {
      this.character = character;
    }

    @Override
    public char getUnicode() {
      return character;
    }

    @Override
    public String getFontFamily() {
      return "FontAwesomeRegular";
    }

    public static IconFont getIconFont() {
      return new IconFont() {
        @Override
        public String getFontFamily() {
          return "FontAwesomeRegular";
        }

        @Override
        public InputStream getFontInputStream() {
          return FontAwesome.class.getResourceAsStream("/fonts/font_awesome/fa-regular-400.ttf");
        }
      };
    }

}
