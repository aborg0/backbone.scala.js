
import scala.scalajs.js
import js.annotation._
import org.scalajs.jquery._
import com.mind_era.underscore._
import org.scalajs.dom.raw.Window
import org.scalajs.dom.raw.HTMLElement

package com.mind_era {

package backbone {

trait AddOptions extends Silenceable {
  var at: Double = js.native
}

trait HistoryOptions extends Silenceable {
  var pushState: Boolean = js.native
  var root: String = js.native
}

trait NavigateOptions extends js.Object {
  var trigger: Boolean = js.native
}

trait RouterOptions extends js.Object {
  var routes: js.Any = js.native
}

trait Silenceable extends js.Object {
  var silent: Boolean = js.native
}

trait Validable extends js.Object {
  var validate: Boolean = js.native
}

trait Waitable extends js.Object {
  @JSName("wait")
  var waitJS: Boolean = js.native
}

trait Parseable extends js.Object {
  var parse: js.Any = js.native
}

trait PersistenceOptions extends js.Object {
  var url: String = js.native
  var beforeSend: js.Function1[JQueryXHR, Unit] = js.native
  var success: js.Function3[js.Any, js.Any, js.Any, Unit] = js.native
  var error: js.Function3[js.Any, JQueryXHR, js.Any, Unit] = js.native
}

trait ModelSetOptions extends Silenceable with Validable {
}

trait ModelFetchOptions extends PersistenceOptions with ModelSetOptions with Parseable {
}

trait ModelSaveOptions extends Silenceable with Waitable with Validable with Parseable with PersistenceOptions {
  var patch: Boolean = js.native
}

trait ModelDestroyOptions extends Waitable with PersistenceOptions {
}

trait CollectionFetchOptions extends PersistenceOptions with Parseable {
  var reset: Boolean = js.native
}

@JSName("Backbone.Events")
class Events extends js.Object {
  def on(eventName: String, callback: js.Function = ???, context: js.Any = ???): js.Dynamic = js.native
  def off(eventName: String = ???, callback: js.Function = ???, context: js.Any = ???): js.Dynamic = js.native
  def trigger(eventName: String, args: js.Any*): js.Dynamic = js.native
  def bind(eventName: String, callback: js.Function, context: js.Any = ???): js.Dynamic = js.native
  def unbind(eventName: String = ???, callback: js.Function = ???, context: js.Any = ???): js.Dynamic = js.native
  def once(events: String, callback: js.Function, context: js.Any = ???): js.Dynamic = js.native
  def listenTo(`object`: js.Any, events: String, callback: js.Function): js.Dynamic = js.native
  def listenToOnce(`object`: js.Any, events: String, callback: js.Function): js.Dynamic = js.native
  def stopListening(`object`: js.Any = ???, events: String = ???, callback: js.Function = ???): js.Dynamic = js.native
}

@JSName("Backbone.ModelBase")
class ModelBase extends Events {
  var url: js.Any = js.native
  def parse(response: js.Any, options: js.Any = ???): js.Dynamic = js.native
  def toJSON(options: js.Any = ???): js.Dynamic = js.native
  def sync(arg: js.Any*): JQueryXHR = js.native
}

@JSName("Backbone.Model")
class Model protected () extends ModelBase {
  //https://books.google.com/books?id=3JOHCAAAQBAJ&lpg=PT274&ots=eMqG4wHhYz&dq=private%20static%20extend%20typescript&pg=PT273#v=onepage&q=private%20static%20extend%20typescript&f=false
//          /**
//        * Do not use, prefer TypeScript's extend functionality.
//        **/
//        private static extend(properties: any, classProperties?: any): any;

  
  def this(attributes: js.Any = ???, options: js.Any = ???) = this()
  var attributes: js.Any = js.native
  var changed: js.Array[js.Any] = js.native
  var cid: String = js.native
  var collection: backbone.Collection[_ <: Model/*js.Any*/] = js.native
  def defaults(): js.Dynamic = js.native
  var id: js.Any = js.native
  var idAttribute: String = js.native
  var validationError: js.Any = js.native
  var urlRoot: js.Any = js.native
  def initialize(attributes: js.Any = ???, options: js.Any = ???): Unit = js.native
  def fetch(options: ModelFetchOptions = ???): JQueryXHR = js.native
  def get(attributeName: String): js.Dynamic = js.native
  @JSName("set")
  def setAttribute(attributeName: String, value: js.Any, options: ModelSetOptions = ???): Model = js.native
  def set(obj: js.Any, options: ModelSetOptions = ???): Model = js.native
  def change(): js.Dynamic = js.native
  def changedAttributes(attributes: js.Any = ???): js.Array[js.Any] = js.native
  def clear(options: Silenceable = ???): js.Dynamic = js.native
  @JSName("clone")
  def cloneJS(): Model = js.native
  def destroy(options: ModelDestroyOptions = ???): js.Dynamic = js.native
  def escape(attribute: String): String = js.native
  def has(attribute: String): Boolean = js.native
  def hasChanged(attribute: String = ???): Boolean = js.native
  def isNew(): Boolean = js.native
  def isValid(options: js.Any = ???): Boolean = js.native
  def previous(attribute: String): js.Dynamic = js.native
  def previousAttributes(): js.Array[js.Any] = js.native
  def save(attributes: js.Any = ???, options: ModelSaveOptions = ???): js.Dynamic = js.native
  def unset(attribute: String, options: Silenceable = ???): Model = js.native
  def validate(attributes: js.Any, options: js.Any = ???): js.Dynamic = js.native

  //        private _validate(attrs: any, options: any): boolean;
  
  def keys(): js.Array[String] = js.native
  def values(): js.Array[js.Any] = js.native
  def pairs(): js.Array[js.Any] = js.native
  def invert(): js.Dynamic = js.native
  def pick(keys: js.Array[String]): js.Dynamic = js.native
  def omit(keys: js.Array[String]): js.Dynamic = js.native
}

@JSName("Backbone.Collection")
class Collection[TModel <: Model] protected () extends ModelBase {
//        /**
//        * Do not use, prefer TypeScript's extend functionality.
//        **/
//        private static extend(properties: any, classProperties?: any): any;
  def this(models: js.Array[TModel] = ???, options: js.Any = ???) = this()
  var models: js.Array[TModel] = js.native
  var length: Double = js.native
  def initialize(models: js.Array[TModel] = ???, options: js.Any = ???): Unit = js.native
  def fetch(options: CollectionFetchOptions = ???): JQueryXHR = js.native
  def comparator(element: TModel): Double = js.native
  def comparator(compare: TModel, to: TModel = ???): Double = js.native
  def add(model: TModel, options: AddOptions = ???): Collection[TModel] = js.native
  @JSName("add")
  def addModels(models: js.Array[TModel], options: AddOptions = ???): Collection[TModel] = js.native
  def at(index: Double): TModel = js.native
  def get(id: Double): TModel = js.native
  def create(attributes: js.Any, options: ModelSaveOptions = ???): TModel = js.native
  def pluck(attribute: String): js.Array[js.Any] = js.native
  def push(model: TModel, options: AddOptions = ???): TModel = js.native
  def pop(options: Silenceable = ???): TModel = js.native
  def remove(model: TModel, options: Silenceable = ???): TModel = js.native
  @JSName("remove")
  def removeModels(models: js.Array[TModel], options: Silenceable = ???): js.Array[TModel] = js.native
  def reset(models: js.Array[TModel] = ???, options: Silenceable = ???): js.Array[TModel] = js.native
  def set(models: js.Array[TModel] = ???, options: Silenceable = ???): js.Array[TModel] = js.native
  def shift(options: Silenceable = ???): TModel = js.native
  def sort(options: Silenceable = ???): Collection[TModel] = js.native
  def unshift(model: TModel, options: AddOptions = ???): TModel = js.native
  def where(properies: js.Any): js.Array[TModel] = js.native
  def findWhere(properties: js.Any): TModel = js.native
  
//        private _prepareModel(attrs?: any, options?: any): any;
//        private _removeReference(model: TModel): void;
//        private _onModelEvent(event: string, model: TModel, collection: Collection<TModel>, options: any): void;

  def all(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): Boolean = js.native
  def any(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): Boolean = js.native
  def collect(iterator: js.Function3[TModel, Double, js.Any, js.Array[js.Any]], context: js.Any = ???): js.Array[js.Any] = js.native
  def chain(): js.Dynamic = js.native
  def contains(value: js.Any): Boolean = js.native
  def countBy(iterator: js.Function2[TModel, Double, Any]): com.mind_era.underscore.Dictionary[Double] = js.native
  def countBy(attribute: String): com.mind_era.underscore.Dictionary[Double] = js.native
  def detect(iterator: js.Function1[js.Any, Boolean], context: js.Any = ???): js.Dynamic = js.native
  def drop(): TModel = js.native
  def drop(n: Double): js.Array[TModel] = js.native
  def each(iterator: js.Function3[TModel, Double, js.Any, Unit], context: js.Any = ???): js.Dynamic = js.native
  def every(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): Boolean = js.native
  def filter(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): js.Array[TModel] = js.native
  def find(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): TModel = js.native
  def first(): TModel = js.native
  def first(n: Double): js.Array[TModel] = js.native
  def foldl(iterator: js.Function3[js.Any, TModel, Double, Any], initialMemo: js.Any, context: js.Any = ???): js.Dynamic = js.native
  def forEach(iterator: js.Function3[TModel, Double, js.Any, Unit], context: js.Any = ???): js.Dynamic = js.native
  def groupBy(iterator: js.Function2[TModel, Double, String], context: js.Any = ???): com.mind_era.underscore.Dictionary[js.Array[TModel]] = js.native
  @JSName("groupBy")
  def groupByAttribute(attribute: String, context: js.Any = ???): com.mind_era.underscore.Dictionary[js.Array[TModel]] = js.native
  def include(value: js.Any): Boolean = js.native
  def indexOf(element: TModel, isSorted: Boolean = ???): Double = js.native
  def initial(): TModel = js.native
  def initial(n: Double): js.Array[TModel] = js.native
  def inject(iterator: js.Function3[js.Any, TModel, Double, Any], initialMemo: js.Any, context: js.Any = ???): js.Dynamic = js.native
  def isEmpty(`object`: js.Any): Boolean = js.native
  def invoke(methodName: String, args: js.Array[js.Any] = ???): js.Dynamic = js.native
  def last(): TModel = js.native
  def last(n: Double): js.Array[TModel] = js.native
  def lastIndexOf(element: TModel, fromIndex: Double = ???): Double = js.native
  def map(iterator: js.Function3[TModel, Double, js.Any, Any], context: js.Any = ???): js.Array[js.Any] = js.native
  def max(iterator: js.Function2[TModel, Double, Any] = ???, context: js.Any = ???): TModel = js.native
  def min(iterator: js.Function2[TModel, Double, Any] = ???, context: js.Any = ???): TModel = js.native
  def reduce(iterator: js.Function3[js.Any, TModel, Double, Any], initialMemo: js.Any, context: js.Any = ???): js.Dynamic = js.native
  def select(iterator: js.Any, context: js.Any = ???): js.Array[js.Any] = js.native
  def size(): Double = js.native
  def shuffle(): js.Array[js.Any] = js.native
  def some(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): Boolean = js.native
  def sortBy(iterator: js.Function2[TModel, Double, Double], context: js.Any = ???): js.Array[TModel] = js.native
  @JSName("sortBy")
  def sortByAttribute(attribute: String, context: js.Any = ???): js.Array[TModel] = js.native
  def sortedIndex(element: TModel, iterator: js.Function2[TModel, Double, Double] = ???): Double = js.native
  def reduceRight(iterator: js.Function3[js.Any, TModel, Double, Any], initialMemo: js.Any, context: js.Any = ???): js.Array[js.Any] = js.native
  def reject(iterator: js.Function2[TModel, Double, Boolean], context: js.Any = ???): js.Array[TModel] = js.native
  def rest(): TModel = js.native
  def rest(n: Double): js.Array[TModel] = js.native
  def tail(): TModel = js.native
  def tail(n: Double): js.Array[TModel] = js.native
  def toArray(): js.Array[js.Any] = js.native
  def without(values: js.Any*): js.Array[TModel] = js.native
}

@JSName("Backbone.Router")
class Router protected () extends Events {
//        /**
//        * Do not use, prefer TypeScript's extend functionality.
//        **/
//        private static extend(properties: any, classProperties?: any): any;
  
  def this(options: RouterOptions = ???) = this()
  var routes: js.Any = js.native
  def initialize(options: RouterOptions = ???): Unit = js.native
  def route(route: String, name: String, callback: js.Function = ???): Router = js.native
  def navigate(fragment: String, options: NavigateOptions = ???): Router = js.native
  @JSName("navigate")
  def navigateTrigger(fragment: String, trigger: Boolean = ???): Router = js.native

//        private _bindRoutes(): void;
//        private _routeToRegExp(route: string): RegExp;
//        private _extractParameters(route: RegExp, fragment: string): string[];
}

@JSName("Backbone.History")
class History extends Events {
  var handlers: js.Array[js.Any] = js.native
  var interval: Double = js.native
  def start(options: HistoryOptions = ???): Boolean = js.native
  def getHash(window: Window = ???): String = js.native
  def getFragment(fragment: String = ???, forcePushState: Boolean = ???): String = js.native
  def stop(): Unit = js.native
  def route(route: String, callback: js.Function): Double = js.native
  def checkUrl(e: js.Any = ???): Unit = js.native
  def loadUrl(fragmentOverride: String): Boolean = js.native
  def navigate(fragment: String, options: js.Any = ???): Boolean = js.native
  var started: Boolean = js.native
  var options: js.Any = js.native

//        private _updateHash(location: Location, fragment: string, replace: boolean): void;
}

trait ViewOptions[TModel <: Model] extends js.Object {
  var model: TModel = js.native
  var collection: backbone.Collection[TModel] = js.native
  var el: js.Any = js.native
  var id: String = js.native
  var className: String = js.native
  var tagName: String = js.native
  var attributes: js.Any = js.native
}

@JSName("Backbone.View")
class View[TModel <: Model] protected () extends Events {
//        /**
//        * Do not use, prefer TypeScript's extend functionality.
//        **/
//        private static extend(properties: any, classProperties?: any): any;

  def this(options: ViewOptions[TModel] = ???) = this()
  def initialize(options: ViewOptions[TModel] = ???): Unit = js.native
  def events(): js.Dynamic = js.native
  @JSName("$")
  def `$`(selector: String): JQuery = js.native
  var model: TModel = js.native
  var collection: Collection[TModel] = js.native
  def setElement(element: HTMLElement, delegate: Boolean = ???): View[TModel] = js.native
  var id: String = js.native
  var cid: String = js.native
  var className: String = js.native
  var tagName: String = js.native
  var el: js.Any = js.native
  @JSName("$el")
  var `$el`: JQuery = js.native
  def setElement(element: js.Any): View[TModel] = js.native
  var attributes: js.Any = js.native
  def render(): View[TModel] = js.native
  def remove(): View[TModel] = js.native
  def make(tagName: js.Any, attributes: js.Any = ???, content: js.Any = ???): js.Dynamic = js.native
  def delegateEvents(events: js.Any = ???): js.Dynamic = js.native
  def undelegateEvents(): js.Dynamic = js.native
  def _ensureElement(): Unit = js.native
}

}

package backbone {
  
@JSName("Backbone")
object Backbone extends js.Object {
  var history: History = js.native
  def sync(method: String, model: Model, options: JQueryAjaxSettings = ???): js.Dynamic = js.native
  def ajax(options: JQueryAjaxSettings = ???): JQueryXHR = js.native
  var emulateHTTP: Boolean = js.native
  var emulateJSON: Boolean = js.native
  var `$`: JQueryStatic = js.native
}
}

}
