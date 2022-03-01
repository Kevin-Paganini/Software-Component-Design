package mketour.actors;

import javafx.scene.text.Text;
import mketour.CityMap;
import mketour.Museum;
import mketour.Taggable;

public interface Observer {
   void update(Taggable tag, CityMap cityMap, Taggable self);


}
