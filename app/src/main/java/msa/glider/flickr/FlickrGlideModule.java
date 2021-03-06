package msa.glider.flickr;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import java.io.InputStream;

import msa.glider.flickr.api.Photo;

/**
 * Register {@link FlickrModelLoader} for the Flickr sample app.
 */
@GlideModule
public class FlickrGlideModule extends AppGlideModule {
    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {
        registry.append(Photo.class, InputStream.class, new FlickrModelLoader.Factory());
    }

    // Disable manifest parsing to avoid adding similar modules twice.
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
