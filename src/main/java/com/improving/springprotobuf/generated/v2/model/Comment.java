// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comment.proto

package com.improving.springprotobuf.generated.v2.model;

public final class Comment {
  private Comment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CommentMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CommentMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>optional string content = 2;</code>
     */
    java.lang.String getContent();
    /**
     * <code>optional string content = 2;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    boolean hasAuthor();
    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage getAuthor();
    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder getAuthorOrBuilder();
  }
  /**
   * Protobuf type {@code CommentMessage}
   */
  public  static final class CommentMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CommentMessage)
      CommentMessageOrBuilder {
    // Use CommentMessage.newBuilder() to construct.
    private CommentMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CommentMessage() {
      id_ = "";
      content_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private CommentMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 26: {
              com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder subBuilder = null;
              if (author_ != null) {
                subBuilder = author_.toBuilder();
              }
              author_ = input.readMessage(com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(author_);
                author_ = subBuilder.buildPartial();
              }

              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.improving.springprotobuf.generated.v2.model.Comment.internal_static_CommentMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.improving.springprotobuf.generated.v2.model.Comment.internal_static_CommentMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.class, com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    private volatile java.lang.Object content_;
    /**
     * <code>optional string content = 2;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>optional string content = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHOR_FIELD_NUMBER = 3;
    private com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage author_;
    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    public boolean hasAuthor() {
      return author_ != null;
    }
    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    public com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage getAuthor() {
      return author_ == null ? com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.getDefaultInstance() : author_;
    }
    /**
     * <code>optional .AuthorMessage author = 3;</code>
     */
    public com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder getAuthorOrBuilder() {
      return getAuthor();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
      }
      if (author_ != null) {
        output.writeMessage(3, getAuthor());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
      }
      if (author_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAuthor());
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage)) {
        return super.equals(obj);
      }
      com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage other = (com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getContent()
          .equals(other.getContent());
      result = result && (hasAuthor() == other.hasAuthor());
      if (hasAuthor()) {
        result = result && getAuthor()
            .equals(other.getAuthor());
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      if (hasAuthor()) {
        hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
        hash = (53 * hash) + getAuthor().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CommentMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CommentMessage)
        com.improving.springprotobuf.generated.v2.model.Comment.CommentMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.improving.springprotobuf.generated.v2.model.Comment.internal_static_CommentMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.improving.springprotobuf.generated.v2.model.Comment.internal_static_CommentMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.class, com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.Builder.class);
      }

      // Construct using com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = "";

        content_ = "";

        if (authorBuilder_ == null) {
          author_ = null;
        } else {
          author_ = null;
          authorBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.improving.springprotobuf.generated.v2.model.Comment.internal_static_CommentMessage_descriptor;
      }

      public com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage getDefaultInstanceForType() {
        return com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.getDefaultInstance();
      }

      public com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage build() {
        com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage buildPartial() {
        com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage result = new com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage(this);
        result.id_ = id_;
        result.content_ = content_;
        if (authorBuilder_ == null) {
          result.author_ = author_;
        } else {
          result.author_ = authorBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage) {
          return mergeFrom((com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage other) {
        if (other == com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.hasAuthor()) {
          mergeAuthor(other.getAuthor());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>optional string content = 2;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string content = 2;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string content = 2;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 2;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 2;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage author_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder> authorBuilder_;
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public boolean hasAuthor() {
        return authorBuilder_ != null || author_ != null;
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage getAuthor() {
        if (authorBuilder_ == null) {
          return author_ == null ? com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.getDefaultInstance() : author_;
        } else {
          return authorBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public Builder setAuthor(com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage value) {
        if (authorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          author_ = value;
          onChanged();
        } else {
          authorBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public Builder setAuthor(
          com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder builderForValue) {
        if (authorBuilder_ == null) {
          author_ = builderForValue.build();
          onChanged();
        } else {
          authorBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public Builder mergeAuthor(com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage value) {
        if (authorBuilder_ == null) {
          if (author_ != null) {
            author_ =
              com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.newBuilder(author_).mergeFrom(value).buildPartial();
          } else {
            author_ = value;
          }
          onChanged();
        } else {
          authorBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public Builder clearAuthor() {
        if (authorBuilder_ == null) {
          author_ = null;
          onChanged();
        } else {
          author_ = null;
          authorBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder getAuthorBuilder() {
        
        onChanged();
        return getAuthorFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      public com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder getAuthorOrBuilder() {
        if (authorBuilder_ != null) {
          return authorBuilder_.getMessageOrBuilder();
        } else {
          return author_ == null ?
              com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.getDefaultInstance() : author_;
        }
      }
      /**
       * <code>optional .AuthorMessage author = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder> 
          getAuthorFieldBuilder() {
        if (authorBuilder_ == null) {
          authorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessage.Builder, com.improving.springprotobuf.generated.v2.model.Author.AuthorMessageOrBuilder>(
                  getAuthor(),
                  getParentForChildren(),
                  isClean());
          author_ = null;
        }
        return authorBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:CommentMessage)
    }

    // @@protoc_insertion_point(class_scope:CommentMessage)
    private static final com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage();
    }

    public static com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CommentMessage>
        PARSER = new com.google.protobuf.AbstractParser<CommentMessage>() {
      public CommentMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CommentMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CommentMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CommentMessage> getParserForType() {
      return PARSER;
    }

    public com.improving.springprotobuf.generated.v2.model.Comment.CommentMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommentMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommentMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcomment.proto\032\014author.proto\"M\n\016Comment" +
      "Message\022\n\n\002id\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\036\n\006" +
      "author\030\003 \001(\0132\016.AuthorMessageB1\n/com.impr" +
      "oving.springprotobuf.generated.v2.modelb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.improving.springprotobuf.generated.v2.model.Author.getDescriptor(),
        }, assigner);
    internal_static_CommentMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CommentMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommentMessage_descriptor,
        new java.lang.String[] { "Id", "Content", "Author", });
    com.improving.springprotobuf.generated.v2.model.Author.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
