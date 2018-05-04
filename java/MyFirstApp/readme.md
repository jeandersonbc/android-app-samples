# My First App

* Hello world in Android.
* Reference: https://developer.android.com/training/basics/firstapp/

## What we learned in this sample?

### Activities

Activities are one of the many Android components, and it is responsible for
user interaction.
Every activity must be declared in the `AndroidManifest.xml` file.
The **MainActivity** is the main entry-point of an Android App; it's where
everything starts.

In order to provide user interaction, an Activities contain a **layout**
described as an XML file.
A layout is is the placeholder for widgets (eg, buttons, text fields, etc), and
it is organized in a hierarchy of components.
Layouts are known as **ViewGroup** and UI components (ie, Widgets) are known as **View**.

### Navigation

One app may contain several activities.
How to create a navigation workflow?
An activity may start another activity via **Intents** with the
**startActivity** method.
To provide backwards navigation, the developer needs to specify the parent and
the child activities.
To do so, on the `AndroidManifest.xml` file, it is possible to use the
`android:parentActivityName` attribute.
Since this approach requires at least API level 16, the developer may add the
following snippet to provide backwards compatibility:

```
<meta-data android:name="android.support.PARENT_ACITIVY"
           android:value="<the name of the parent activity>" />

```

### Constraint Layout

Constraint layout is a type of layout where you can specify the position of
widgets according to its sibling views and its parent container.
It is used to create responsive layouts.

### String Resource

The string resource is where all UI text must be declared, and it provides a
simple way to internationalize UI texts.

