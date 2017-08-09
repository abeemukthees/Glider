package msa.glider.flickr;

import java.util.List;

import msa.glider.flickr.api.Photo;

/**
 * An interface for an object that displays {@link msa.glider.flickr.api.Photo}
 * objects.
 */
public interface PhotoViewer {
    /**
     * Called whenever new {@link msa.glider.flickr.api.Photo}s are loaded.
     *
     * @param photos The loaded photos.
     */
    void onPhotosUpdated(List<Photo> photos);
}
