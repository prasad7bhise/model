package ai.elimu.model.v2.gson.content;

import ai.elimu.model.v2.enums.content.ImageFormat;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/main/src/main/java/ai/elimu/entity
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImageGson extends ContentGson {

  private String title;

  private ImageFormat imageFormat;

  private String checksumMd5;

  private String fileUrl;

  private Integer fileSize;

  private Set<WordGson> words;
}
