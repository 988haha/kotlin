// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build-common/src/java_descriptors.proto

package org.jetbrains.kotlin.metadata.java;

public final class JavaClassProtoBuf {
  private JavaClassProtoBuf() {}
  public static void registerAllExtensions(
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isStaticMethod);
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isPackagePrivateMethod);
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isStaticField);
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isPackagePrivateField);
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isPackagePrivateClass);
    registry.add(org.jetbrains.kotlin.metadata.java.JavaClassProtoBuf.isPackagePrivateConstructor);
  }
  public static final int IS_STATIC_METHOD_FIELD_NUMBER = 1000;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Function { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Function,
      java.lang.Boolean> isStaticMethod = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Function.getDefaultInstance(),
        false,
        null,
        null,
        1000,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);
  public static final int IS_PACKAGE_PRIVATE_METHOD_FIELD_NUMBER = 1001;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Function { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Function,
      java.lang.Boolean> isPackagePrivateMethod = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Function.getDefaultInstance(),
        false,
        null,
        null,
        1001,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);
  public static final int IS_STATIC_FIELD_FIELD_NUMBER = 1000;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Property { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Property,
      java.lang.Boolean> isStaticField = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Property.getDefaultInstance(),
        false,
        null,
        null,
        1000,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);
  public static final int IS_PACKAGE_PRIVATE_FIELD_FIELD_NUMBER = 1001;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Property { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Property,
      java.lang.Boolean> isPackagePrivateField = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Property.getDefaultInstance(),
        false,
        null,
        null,
        1001,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);
  public static final int IS_PACKAGE_PRIVATE_CLASS_FIELD_NUMBER = 1000;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Class { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Class,
      java.lang.Boolean> isPackagePrivateClass = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Class.getDefaultInstance(),
        false,
        null,
        null,
        1000,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);
  public static final int IS_PACKAGE_PRIVATE_CONSTRUCTOR_FIELD_NUMBER = 1000;
  /**
   * <code>extend .org.jetbrains.kotlin.metadata.Constructor { ... }</code>
   */
  public static final
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite.GeneratedExtension<
      org.jetbrains.kotlin.metadata.ProtoBuf.Constructor,
      java.lang.Boolean> isPackagePrivateConstructor = org.jetbrains.kotlin.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        org.jetbrains.kotlin.metadata.ProtoBuf.Constructor.getDefaultInstance(),
        false,
        null,
        null,
        1000,
        org.jetbrains.kotlin.protobuf.WireFormat.FieldType.BOOL,
        java.lang.Boolean.class);

  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}