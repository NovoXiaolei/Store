/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_example_store_Store */

#ifndef _Included_com_example_store_Store
#define _Included_com_example_store_Store
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_example_store_Store
 * Method:    getInteger
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_example_store_Store_getInteger
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    setInteger
 * Signature: (Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_com_example_store_Store_setInteger
  (JNIEnv *, jobject, jstring, jint);

/*
 * Class:     com_example_store_Store
 * Method:    getString
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_store_Store_getString
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    setString
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_example_store_Store_setString
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    GetColor
 * Signature: (Ljava/lang/String;)Lcom/example/store/Color;
 */
JNIEXPORT jobject JNICALL Java_com_example_store_Store_GetColor
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    setColor
 * Signature: (Ljava/lang/String;Lcom/example/store/Color;)V
 */
JNIEXPORT void JNICALL Java_com_example_store_Store_setColor
  (JNIEnv *, jobject, jstring, jobject);

/*
 * Class:     com_example_store_Store
 * Method:    getIntegerArray
 * Signature: (Ljava/lang/String;)[I
 */
JNIEXPORT jintArray JNICALL Java_com_example_store_Store_getIntegerArray
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    setIntegerArray
 * Signature: (Ljava/lang/String;[I)V
 */
JNIEXPORT void JNICALL Java_com_example_store_Store_setIntegerArray
  (JNIEnv *, jobject, jstring, jintArray);

/*
 * Class:     com_example_store_Store
 * Method:    getColorArray
 * Signature: (Ljava/lang/String;)[Lcom/example/store/Color;
 */
JNIEXPORT jobjectArray JNICALL Java_com_example_store_Store_getColorArray
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_example_store_Store
 * Method:    setColorArray
 * Signature: (Ljava/lang/String;[Lcom/example/store/Color;)V
 */
JNIEXPORT void JNICALL Java_com_example_store_Store_setColorArray
  (JNIEnv *, jobject, jstring, jobjectArray);

#ifdef __cplusplus
}
#endif
#endif
